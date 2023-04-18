public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Televisão ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Televisão desligada");
    }

    public void mudarCanalEspecifico(int numeroDoCanal){
        canal = numeroDoCanal;
        System.out.println("Canal " + canal);
    }

    public void subirUmCanal(){
        canal++;
        System.out.println("Canal " + canal);
    }

    public void descerUmCanal(){
        canal--;
        System.out.println("Canal " + canal);
    }

    public void mudarVolumeEspecifico(int volumeSelecionado){
        volume = volumeSelecionado;
        System.out.println("Volume " + volume);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume " + volume);
    }
}
