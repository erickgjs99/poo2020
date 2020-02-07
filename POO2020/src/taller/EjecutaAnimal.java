package taller;

public class EjecutaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.actualizaRaza("Tigre");
        animal.actualizaPeso(521);
        animal.actualizarcomida("Carne");
        animal.actualizacelo("Si");
        animal.actualizaMetros(1365);
        animal.actualizaSueño(12);
        String mostrar_datos = animal.obtenerDatos();
        System.out.println(mostrar_datos);
    }
}
