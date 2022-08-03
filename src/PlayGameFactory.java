public class PlayGameFactory implements GameFactory{
    @Override
    public CopiaDigital copiaDigital() {
        return new DigitalPlay();
    }

    @Override
    public CopiaFisica copiaFisica() {
        return new FisicoPlay();
    }
}
