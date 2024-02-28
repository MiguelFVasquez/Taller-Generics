package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterador<T>  implements Iterator<T> {

    private int indiceActual=0;
    private List<T> lista;

    public Iterador(ArrayList<T> conjunto) {
        this.lista=conjunto;
    }

    @Override
    public boolean hasNext() {
        return indiceActual < lista.size();
    }

    @Override
    public T next() {
        return lista.get(indiceActual++);
    }
}
