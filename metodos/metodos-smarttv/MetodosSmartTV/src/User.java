public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv samsungSmartTv = new SmartTv();

        System.out.println("A TV está ligada? " + samsungSmartTv.ligada);
        System.out.println("Em qual canal a TV está? " + samsungSmartTv.canal);
        System.out.println("Qual o volume atual da TV? " + samsungSmartTv.volume);

        samsungSmartTv.desligar();
        samsungSmartTv.ligar();

        samsungSmartTv.mudarCanalEspecifico(25);
        samsungSmartTv.subirUmCanal();
        samsungSmartTv.descerUmCanal();

        samsungSmartTv.mudarVolumeEspecifico(40);
        samsungSmartTv.aumentarVolume();
        samsungSmartTv.diminuirVolume();

        System.out.println("A TV está ligada? " + samsungSmartTv.ligada);
        System.out.println("Em qual canal a TV está? " + samsungSmartTv.canal);
        System.out.println("Qual o volume atual da TV? " + samsungSmartTv.volume);
    }
}
