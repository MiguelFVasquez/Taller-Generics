package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Conjunto <T>  implements Iterable{
    private ArrayList<T> conjunto= new ArrayList<T>();

    public Conjunto() {
    }

    public ArrayList<T> getConjunto() {
        return conjunto;
    }

    public void setConjunto(ArrayList<T> conjunto) {
        this.conjunto = conjunto;
    }

    public void agregar(T elemento){
        conjunto.add(elemento);
    }
    public void mostrarElementos(){
        System.out.println(conjunto.toString());
    }

    public boolean verificarElemento(T elemento){
        return conjunto.contains(elemento);
    }
    public boolean verificarConjunto(ArrayList<T> conjunto){
        boolean contenido=false;
        int tamanio= 0;
        for (T elemento: conjunto){
            if (this.conjunto.contains(elemento)){
                tamanio++;
            }
        }
        if (tamanio==conjunto.size()){
            contenido=true;
        }
        return contenido;
    }

    /**
     *
     * @param conjuntoABuscar
     * @return
     */
    public boolean verificarIterator(ArrayList<T> conjuntoABuscar){
        boolean contenido= false;
        int tamanio= 0;
        Iterator iterador= iterator();
        while (iterador.hasNext()){
            if (this.conjunto.contains(iterador.next())) tamanio++;
        }
        if (tamanio==conjuntoABuscar.size()){
            contenido=true;
        }
        return contenido;
    }

    public void unirConjuntos(ArrayList<T> conjunto){
        for (T elemento : conjunto) {
            if (!this.conjunto.contains(elemento)){
                this.conjunto.add(elemento);
            }
        }
    }

    public Iterator<T> iterator(){
        return new Iterador<>(conjunto);
    }

    @Override
    public String toString() {
        return "Conjunto: " +
                  conjunto;
    }
}
