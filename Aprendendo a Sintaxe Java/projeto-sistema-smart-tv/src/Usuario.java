public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();


        smartTv.dimiVoulume();
        smartTv.dimiVoulume();
        smartTv.dimiVoulume();
        smartTv.amentarVoulume();

        System.out.println("Canal Altual: " + smartTv.canal);
        
        smartTv.mudarCanal(13);
        
        System.out.println("Canal Altual: " + smartTv.canal);

        System.out.println("Volume Altual : " + smartTv.volume);



        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Altual: " + smartTv.canal);
        System.out.println("Volume Altual: " + smartTv.volume);

        smartTv.ligada();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligada();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        

    }
}
