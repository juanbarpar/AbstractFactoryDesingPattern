public class Principal {

    public static void main(String[] args) {

        System.out.println("Xbox: ");
        XboxGameFactory xboxGameFactory = new XboxGameFactory();
        System.out.println(xboxGameFactory.copiaDigital().getClave());
        System.out.println(xboxGameFactory.copiaDigital().getInformacion());
        System.out.println(xboxGameFactory.copiaFisica().getInformacion());

        System.out.println("Play: ");
        PlayGameFactory playGameFactory = new PlayGameFactory();
        System.out.println(playGameFactory.copiaDigital().getClave());
        System.out.println(playGameFactory.copiaDigital().getInformacion());
        System.out.println(playGameFactory.copiaFisica().getInformacion());

    }
}
