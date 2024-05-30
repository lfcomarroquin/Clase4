import Animales.Animal;
import Animales.Gato;
import Animales.Perro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(10,"Paquito");
        Animal gatoUno = new Gato(13,"Macarena");
        Animal perroUno = new Perro(7,"Zelda");

        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(animal);
        animales.add(gatoUno);
        animales.add(perroUno);

        for(Animal a : animales){
            System.out.println(a.getNombre());//+" come" + a.comer(2) + " porciones al dia");
            a.comer(2);
            //a.comer();
        }

//        System.out.println("El nombre del animal es " + animal.getNombre());
//        System.out.println("El nombre de la gatita es " + gatoUno.getNombre());
//        System.out.println("El nombre de la perrita es " + perroUno.getNombre());


    }
}