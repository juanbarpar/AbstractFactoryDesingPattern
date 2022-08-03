public class Principal {

    public static void main(String[] args) {

        XboxGameFactory xboxGameFactory = new XboxGameFactory();
        System.out.println(xboxGameFactory.copiaDigital().getClave());
        xboxGameFactory.copiaFisica().getInformacion();

        PlayGameFactory playGameFactory = new PlayGameFactory();
        System.out.println(playGameFactory.copiaDigital().getClave());
        playGameFactory.copiaFisica().getInformacion();

    }
}
