package se1.hu3.adapter;

public class Kakao implements Kakaozubereitung {
    // kakao machen
    @Override
    public void pulvermengeBestimmen() {
        System.out.println("Pulvermenge wird bestimmt");
    }

    @Override
    public void mitWasserVermischen() {
        System.out.println("Wasser wird mit Kakao vermischt");
    }

    @Override
    public void kakaoAusgeben() {
        System.out.println("Kakao wird ausgegeben");
    }
}
