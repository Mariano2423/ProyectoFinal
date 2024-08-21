/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Fabiola
 */
public class Visitante {
    
    //Atributos//
    private int id;
    private String nombre;
    private int edad;
    private String correoElectronico;
    private String fechaIngreso;
    
    //Constructor
    public Visitante(int id, String nombre, int edad, String correoElectronico, String fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.fechaIngreso = fechaIngreso;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    //Metodos Publicos//
    @Override
    public String toString() {
        return "Visitante{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", correoElectronico=" + correoElectronico + ", fechaIngreso=" + fechaIngreso + '}';
    }
    

}
