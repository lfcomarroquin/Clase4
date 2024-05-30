package Animales;

public class Gato extends Animal implements Alimento{
    public Gato(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void comer() {
        System.out.println("El Gato esta comiendo");
    }


    @Override
    public void alimentarse() {
        System.out.println("Me alimento");
    }

    @Override
    public void masticar() {
        System.out.println("Estoy masticando");
    }
}