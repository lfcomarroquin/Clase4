package Animales;

public class Tucan extends Animal implements Actividad{
    public Tucan(int edad, String nombre) {
        super(edad, nombre);
    }


    @Override
    public void volar() {
        System.out.println("Tucan vuela");
    }

    @Override
    public void migrar() {
        System.out.println("Tucan migra");
    }
}