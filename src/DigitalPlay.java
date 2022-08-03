public class DigitalPlay implements CopiaDigital{


    @Override
    public String getInformacion() {
        return "Disponible exclusivamente en la PS Store";
    }

    @Override
    public String getClave() {

        GeneradorDeClave generadorDeClave = new GeneradorDeClave();

        return generadorDeClave.getPassword(10);
    }
}
