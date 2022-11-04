package se1.hu3.adapter;

public class HeissgetraenkemacherAdapterApp {
    public static void main(String[] args) {
        {
            Kaffee melange = new Kaffee();
            Kakaozubereitung kakao1 = new Kakao();

            // kakao wird in den kakaoadapter gegeben um wie ein kaffee zu funktionieren
            Kakaozubereitung kakaoAdapter = new KakaoAdapter(melange);

            System.out.println("Kaffee...");
            melange.kaffeebohnenRoesten();
            melange.bohnenMahlen();
            melange.wasserAufgiessen();
            melange.kaffeeAusgeben();

            System.out.println("Kakao...");
            kakao1.pulvermengeBestimmen();
            kakao1.mitWasserVermischen();
            kakao1.kakaoAusgeben();

            // Kakao verhält sich wie ein Kaffee
            System.out.println("Kakao mittels Kakaoadapter...");
            kakaoAdapter.pulvermengeBestimmen();
            kakaoAdapter.mitWasserVermischen();
            kakaoAdapter.kakaoAusgeben();
        }
    }

    interface Kaffeezubereitung {
        // kaffee interface um kaffee zuzubereiten
        void kaffeebohnenRoesten();
        void bohnenMahlen();
        void wasserAufgiessen();
        void kaffeeAusgeben();
    }

    interface Kakaozubereitung {
        // interface für kakao
        // andere herstellungsschritte
        void pulvermengeBestimmen();
        void mitWasserVermischen();
        void kakaoAusgeben();
    }

    static class Kaffee implements Kaffeezubereitung {
        // kaffee machen
        public void kaffeebohnenRoesten() {
            System.out.println("Bohnen werden geröstet");
        }

        public void bohnenMahlen() {
            System.out.println("Bohnen werden gemahlen");
        }

        public void wasserAufgiessen() {
            System.out.println("Wasser wird aufgegossen");
        }

        public void kaffeeAusgeben() {
            System.out.println("Kaffee wird ausgegeben");
            System.out.println("");
        }
    }

    static class Kakao implements Kakaozubereitung {
        // kakao machen
        public void pulvermengeBestimmen() {
            System.out.println("Pulvermenge wird bestimmt");
        }
        public void mitWasserVermischen() {
            System.out.println("Wasser wird mit Kakao vermischt");
        }

        public void kakaoAusgeben() {
            System.out.println("Kakao wird ausgegeben");
            System.out.println();
        }
    }

    static class KakaoAdapter implements Kakaozubereitung {
        // interface das erwartet wird (kaffee)
        Kaffeezubereitung kaffee;

        public KakaoAdapter(Kaffeezubereitung kaffee) {
            // reference zu dem object (kaffee) das adaptiert wird
            this.kaffee = kaffee;
        }

        public void pulvermengeBestimmen() {
            // umsetzung
            // translate the methods appropriately
            kaffee.bohnenMahlen();
        }

        public void mitWasserVermischen() {
            kaffee.wasserAufgiessen();
        }

        public void kakaoAusgeben() {
            kaffee.kaffeeAusgeben();
        }
    }
}

