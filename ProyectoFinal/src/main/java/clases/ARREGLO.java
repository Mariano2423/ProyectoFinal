/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Fabiola
 */

public class ARREGLO<T> {
    private T[] arreglo;
    private int indice;

    public ARREGLO(int capacidad) {
        arreglo = (T[]) new Object[capacidad]; 
        indice = 0; 
    }
    
    public int getCapacidad() {
        return arreglo.length;
    }
    
    public T[] getArreglo() {
        if (arreglo instanceof Habitat[]) {
            return (T[]) arreglo; 
        }
        return null;
    }
    

    public void setArreglo(T[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getIndice() {
        return indice;
    }

    //Sets y gets
    public void setIndice(int indice) {
        this.indice = indice;
    }

    //Metodos CRUD
    public void agregar(T elemento) {
        if (indice < arreglo.length) {
            arreglo[indice++] = elemento;
        } else {
            throw new ArrayIndexOutOfBoundsException("Capacidad máxima alcanzada");
        }
    }

    public void modificar(T elemento, int id) {
        int index = buscarIndice(id);
        if (index != -1) {
            arreglo[index] = elemento;
        }
    }

    public void eliminar(int id) {
        int index = buscarIndice(id);
        if (index != -1) {
            for (int i = index; i < indice; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            arreglo[--indice] = null;
        }
    }
    

    public T buscar(int id) {
        for (int i = 0; i < indice; i++) {
            if (getId(arreglo[i]) == id) {
                return arreglo[i];
            }
        }
        return null;
    }

    private int buscarIndice(int id) {
        for (int i = 0; i < indice; i++) {
            if (arreglo[i] == null) {
                continue;
            }
            else {
                if (getId(arreglo[i]) == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    private int getId(T elemento) {
        if (elemento instanceof Habitat) {
            return ((Habitat) elemento).getId();
        } else if (elemento instanceof Animal) {
            return ((Animal) elemento).getId();
        } else if (elemento instanceof Alimentacion) {
            return ((Alimentacion) elemento).getId();
        } else if (elemento instanceof Evento) {
            return ((Evento) elemento).getId();    
        } else if (elemento instanceof Visitante) {
            return ((Visitante) elemento).getId();
        }
        throw new IllegalArgumentException("Objeto no soportado en clase CRUD: " + elemento.getClass().getName());
    }
}
