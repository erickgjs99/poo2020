package ejercicioCedula;

    public class Cedula {
        // Declaración de variables
        private String cedula;
        private int residuo = 0;
        private int suma = 0;
        private int verificador =0;
        private int producto = 0;
        private int[] coeficientes= {2, 1, 2, 1, 2, 1, 2, 1, 2};
        private String cadena;


        public Cedula(String cedula) {
            this.cedula = cedula;
        }

        public int[] conversion() {
            int[] numeros = new int[cedula.length()];
            for (int i = 0; i < cedula.length(); i++) {
                numeros[i] = Character.getNumericValue(cedula.charAt(i));
            }
            return numeros;
        }

        public int obtenerVerificador() {
            suma = 0;
            residuo = 0;
            for (int i = 0; i < 9; i++) {
                producto = conversion()[i] * coeficientes[i];
                if (producto >= 10) {
                    producto = producto - 9;
                }
                suma = suma + producto;
            }
            residuo = suma%10;
            verificador= 10 - residuo;
            if (verificador== 10){
                verificador = 0;
            }

            return verificador;
        }

        public String presentar () {
            if (conversion()[9] == obtenerVerificador()) {
                cadena = String.format("Numero de cédula ingresado %s\nVerificador: %d\nEl número de cédula ingresado es correcto", cedula, obtenerVerificador());
            } else {
                cadena = String.format("La cédula ingresada es incorrecta");
            }
            return cadena;
        }


}
