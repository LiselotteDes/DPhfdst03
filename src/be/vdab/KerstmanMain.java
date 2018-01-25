package be.vdab;
public class KerstmanMain {
    public static void main(String[] args) {
        Speelgoed speelgoed = SpeelgoedFactory.INSTANCE.kiesSpeelgoed(4);
        System.out.println(speelgoed.getPrijs());
    }
    
}
