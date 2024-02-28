package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Instancia de diferentes conjuntos
        Conjunto conjunto1= new Conjunto();
        Conjunto conjunto2= new Conjunto<>();
        Conjunto conjunto3=  new Conjunto<>();
        Persona persona1= new Persona("Pepe grillo",2);//Intancia de una clase persona para probar y añadirla a la lista
        //Añadimos elementos al conjunto 1
        conjunto1.agregar("Juan");
        conjunto1.agregar(persona1);
        conjunto1.agregar(25040012);
        //Añadimos elementos al conjunto 2;
        conjunto2.agregar("Miguel");
        //Añadimos elementos al conjunto 3
        conjunto3.agregar("1010");
        conjunto3.agregar("eqwew");
        conjunto3.agregar(23);
        //Unimos el conjunto 1 con el conjunto 2
        conjunto1.unirConjuntos(conjunto2.getConjunto());
        conjunto1.mostrarElementos();//Mostramos los elementos del conjunto 1

        //Probamos si existe un elemento en el conjunto
        if (conjunto1.verificarElemento(persona1)){
            System.out.println("Si está");
        }else {
            System.out.println("Se fue");
        }

        //Probamos si existe un conjunto dentro de otro conjunto
        /*
        if (conjunto1.verificarConjunto(conjunto3.getConjunto())){
            System.out.println("Conjunto: Si está");
        }else {
            System.out.println("Conjunto: No está");
        }*/


        //Probamos si existe un conjunto dentro de otro conjunto
        if (conjunto1.verificarIterator(conjunto3.getConjunto())){
            System.out.println("Conjunto: Si está");
        }else {
            System.out.println("Conjunto: No está");
        }


    }
}