package ejercicioBinario;

public class Binario {
    private String binario;
    private String cad = "";
    private int num = 0;

    public Binario(String binario){
        this.setBinario(binario);
    }


    public int obtenerDecimal(){
        for (int j = 0; j < getBinario().length(); j++){
            if (getBinario().charAt(j) == '1'){
                num += Math.pow(2, ((getBinario().length() - 1)- j));
            }
        }
        return num;
    }





    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }
}
