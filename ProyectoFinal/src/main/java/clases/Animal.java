/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Fabiola
 */
public class Animal {
    
    //Atributos//
    private int id;
    private String nombre;
    private String especie;
    private int edad;
    private Habitat habitat;
    private Alimentacion alimentacion;
    
    
    
    //Constructor//
    public Animal(int id, String nombre, String especie, int edad, Habitat habitat, Alimentacion alimentacion) {  
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
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

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {    
        this.edad = edad;
    }    
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Alimentacion getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Alimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    //Metodos Publicos//
    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", habitat=" + habitat + ", alimentacion=" + alimentacion + '}';
    }
    
    
}
