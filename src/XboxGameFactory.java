public class XboxGameFactory implements GameFactory{

    @Override
    public CopiaDigital copiaDigital() {
        return new DigitalXbox();
    }

    @Override
    public CopiaFisica copiaFisica() {
        return new FisicoXbox() {
        };
    }
}
