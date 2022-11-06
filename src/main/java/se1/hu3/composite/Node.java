package se1.hu3.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 /*   Ein abstraktes Composite-Component
 /*
 /*  Dieses kann:
 /*   + Bei instantierung eine eigene Unique ID vergeben, und seinen Namen merken
 /*   + Kinder-Nodes verwalten: addNode(), removeNode(), removeAllNodes()
 /*   + Rekursiv von diesem Node bis in alle End-Nodes (Blätter) "hochfahren": startupAll()
 /*   + Rekursiv von allen End-Nodes bis zu diesem Node "anhalten":  shutdownAll()
 /*   + Rekursiv von diesem Node bis in alle End-Nodes die Baumhierarchie ausgeben: printNodes()
 /*   + Sich selbst beschreiben: toString()
 /*
 /*   Implementierungen dieser abstraken Klasse müssen alle hier abstraken Methoden implementieren:
 /*   + Node hochfahren: startup()
 /*   + Node anhalten: shutdown()
 */
public abstract class Node {

    private static int idCounter=1000;  // zur Erzeugung von unique ID's
    protected static final int getUniqueId() { return ++idCounter; } // nicht threadsafe!

    private int id;
    private String name;
    private List<Node> childNodes= null;


    // Erzeuge neuen Knoten mit gegebenem Namen, vergebe unique ID
    public Node(String name)
    {
        this.name= name;
        id= getUniqueId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    /** ABSTRACT: starte diese Komponente.  */
    public abstract void startup();

    /** ABSTRACT: stoppe diese Komponente */
    public abstract void shutdown();


    /** Diese und alle Kinderkomponenten starten */
    public void startupAll() {
        startup();
        if (childNodes == null) {
            return; // Terminaler Knoten
        }

        for (Node n : childNodes) {
            n.startupAll();
        }
    }


    /** Alle Kinderkomponenten stoppen und dann diese hier */
    public void shutdownAll() {

        if (childNodes != null) {
            Collections.reverse(childNodes);   // Kinder umgekehrt abschalten
            for (Node n : childNodes) {
                n.shutdownAll();
            }
        }
        shutdown();
    }



    public String toString()
    {
        return "Id: "+ id +" Typ: "+ getClass().getSimpleName()+ "  Name: "+name;
    }

    public void printNodes() {
        printNodes(0);
    }

    private void printNodes(int depth) {

        for (int i=0; i< depth; i++)
            System.out.print("..");  // Knotenebenen Einrücken
        System.out.println(toString());

        if (childNodes == null) {
            return; // Terminaler Knoten
        }

        depth++;
        for (Node n : childNodes) {
            n.printNodes(depth);
        }

        // Alternative 1 mit forEach und Lambda Funktion
        // childNodes.forEach(childNodes -> { childNodes.printNodes();} );

        // Alterntive 2	mit forEach und Method Reference Syntax
        // childNodes.forEach(Node::printNodes);
    }

    public void addNode(Node node) {
        if (childNodes == null)
            childNodes= new ArrayList<Node>();  // Lazy instantiation - nicht threadsafe!
        childNodes.add(node);
    }

    public void removeNode(Node node) {
        if (childNodes == null)
            return;
        childNodes.remove(node);
    }

    public void removeAllNodes() {
        if (childNodes == null)
            return;
        childNodes.clear();
        childNodes= null;
    }
}