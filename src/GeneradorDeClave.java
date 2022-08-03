public class GeneradorDeClave {


        private static String NUMEROS = "0123456789";

        private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public String getPassword(int length) {
            return getPassword(NUMEROS + MAYUSCULAS , length);
        }

        public static String getPassword(String key, int length) {
            String pswd = "";

            for (int i = 0; i < length; i++) {
                pswd+=(key.charAt((int)(Math.random() * key.length())));
            }

            return pswd;
        }

}
