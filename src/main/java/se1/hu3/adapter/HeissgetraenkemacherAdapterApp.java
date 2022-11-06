package se1.hu3.adapter;

public class HeissgetraenkemacherAdapterApp {
    public static void main(String[] args) {
        {
            Automat automat;
            automat = new Automat(new Kaffee());

            System.out.println("Bitte einen Kaffee.");
            automat.zubereitung();

            // kakao wird in den kakaoadapter gegeben um wie ein kaffee zu funktionieren
            automat = new Automat(new GetraenkAdapter(new Kakao()));
//            hgm= new Heissgetraenkemacher(new KaffeezubereiterAdapter(new KakaozubereitungImpl()));
            // Kakao verhält sich wie ein Kaffee
            System.out.println("Bitte einen Kakao.");
            automat.zubereitung();

        }
    }
}





