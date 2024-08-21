/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Fabiola
 */
public class Habitat {
    
    //Atributos
    private int id;
    private String nombre;
    private String tipoAmbiente;
    private int capacidad;
    
    //Constructor
    public Habitat(int id, String nombre, String tipoAmbiente, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidad = capacidad;
    }
    
    //Sets y Gets//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    //Metodos Publicos//
    @Override
    public String toString() {
        return "Habitat{" + "id=" + id + ", nombre=" + nombre + ", tipoAmbiente=" + tipoAmbiente + ", capacidad=" + capacidad + '}';
    }
    
    
}
