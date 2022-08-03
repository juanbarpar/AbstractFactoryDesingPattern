public class DigitalXbox implements CopiaDigital{
    @Override
    public String getInformacion() {
        return "Disponible en tiendas digitales y en la Microsoft Store";
    }

    @Override
    public String getClave() {

        GeneradorDeClave generadorDeClave = new GeneradorDeClave();

        return generadorDeClave.getPassword(5)+"-"+generadorDeClave.getPassword(5)+"-"+generadorDeClave.getPassword(5);
    }
}
