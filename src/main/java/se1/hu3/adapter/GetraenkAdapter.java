package se1.hu3.adapter;

public class GetraenkAdapter implements Kaffeezubereitung {
    // interface das erwartet wird (kaffee)
    Kakao kakao;

    public GetraenkAdapter(Kakao kakao) {
        // reference zu dem object (kaffee) das adaptiert wird
        this.kakao = kakao;
    }

    // drei der kaffee methoden lassen sich auch für kakao verwenden
    @Override
    public void kaffeebohnenRoesten() {

    }

    @Override
    public void bohnenMahlen() {
        kakao.pulvermengeBestimmen();
    }

    @Override
    public void wasserAufgiessen() {
        kakao.mitWasserVermischen();
    }

    @Override
    public void kaffeeAusgeben() {
        kakao.kakaoAusgeben();
    }
}
