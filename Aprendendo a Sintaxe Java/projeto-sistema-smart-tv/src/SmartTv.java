public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void ligada(){
        ligada = true;
    }

    public void desligada(){
        ligada = false;
    }
    

    public void amentarVoulume(){
        volume++;
        System.out.println("Aumentando Volume Para: " + volume);
    }

    public void dimiVoulume(){
        volume--;
        System.out.println("Diminuindo Volume Para: " + volume);
    }
}
