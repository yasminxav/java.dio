public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? "+ smartTv.volume);
        
        smartTv.ligar ();
        System.out.println("TV Ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Volume atual? " + smartTv.volume);
        smartTv.mudarCanal(15);
        System.out.println("Canal atual? " + smartTv.canal);
    }
}
