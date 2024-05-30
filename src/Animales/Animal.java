package Animales;

public class Animal {
    private int edad;

    private String nombre;

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("Comer");
    }

    public void comer(int porciones){
        System.out.println("Come " + porciones + " porciones al dia");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}