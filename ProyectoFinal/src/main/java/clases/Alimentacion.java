/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


/**
 *
 * @author Fabiola
 */
public class Alimentacion {

    //Atributos//
    private int id;
    private String horario;
    private String alimento;
    private int cantidad;
    private String frecuencia;
    
    //Constructor
    public Alimentacion(int id, String horario, String alimento, int cantidad, String frecuencia) {
        this.id = id;
        this.horario = horario;
        this.alimento = alimento;
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
    }    
    
    
    //Sets y Gets//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    //Metodos Publicos//
    @Override
    public String toString() {
        return "Alimentacion{" + "id=" + id + ", horario=" + horario + ", alimento=" + alimento + ", cantidad=" + cantidad + ", frecuencia=" + frecuencia + '}';
    }
    
    
}
