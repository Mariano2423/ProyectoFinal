/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Fabiola
 */
public class Zoologico {

    //Atributos
    private ARREGLO<Habitat> habitats;
    private ARREGLO<Animal> animales;
    private ARREGLO<Alimentacion> alimentaciones;
    private ARREGLO<Evento> eventos;
    private ARREGLO<Visitante> visitantes;

    //Constructor
    public Zoologico() {
        this.habitats = new ARREGLO<>(100);
        this.animales = new ARREGLO<>(1000);
        this.alimentaciones = new ARREGLO<>(1000);
        this.eventos = new ARREGLO<>(100);
        this.visitantes = new ARREGLO<>(10000);
    }
    
    //Sets y Gets
    public ARREGLO<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(ARREGLO<Habitat> habitats) {
        this.habitats = habitats;
    }

    public ARREGLO<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ARREGLO<Animal> animales) {
        this.animales = animales;
    }

    public ARREGLO<Alimentacion> getAlimentaciones() {
        return alimentaciones;
    }

    public void setAlimentaciones(ARREGLO<Alimentacion> alimentaciones) {
        this.alimentaciones = alimentaciones;
    }

    public ARREGLO<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ARREGLO<Evento> eventos) {
        this.eventos = eventos;
    }

    public ARREGLO<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ARREGLO<Visitante> visitantes) {
        this.visitantes = visitantes;
    }    

    //Metodos
    
    /////////////
    //*Habitat*//
    /////////////
    public void agregarHabitat(Habitat habitat) {
        habitats.agregar(habitat);
    }

    public void modificarHabitat(Habitat habitat) {
        habitats.modificar(habitat, habitat.getId());
    }

    public void eliminarHabitat(int id) {
        habitats.eliminar(id);
    }

    public Habitat buscarHabitat(int id) {
        return habitats.buscar(id);
    }
    

    /////////////
    //*Animal*//
    /////////////
    public void agregarAnimal(Animal animal) {
        animales.agregar(animal);
    }

    public void modificarAnimal(Animal animal) {
        animales.modificar(animal, animal.getId());
    }

    public void eliminarAnimal(int id) {
        animales.eliminar(id);
    }

    public Animal buscarAnimal(int id) {
        return animales.buscar(id);
    }

    //////////////////
    //*Alimentacion*//
    //////////////////
    public void agregarAlimentacion(Alimentacion alimentacion) {
        alimentaciones.agregar(alimentacion);
    }

    public void modificarAlimentacion(Alimentacion alimentacion) {
        alimentaciones.modificar(alimentacion, alimentacion.getId());
    }

    public void eliminarAlimentacion(int id) {
        alimentaciones.eliminar(id);
    }

    public Alimentacion buscarAlimentacion(int id) {
        return alimentaciones.buscar(id);
    }

    ////////////
    //*Evento*//
    ////////////
    public void agregarEvento(Evento evento) {
        eventos.agregar(evento);
    }

    public void modificarEvento(Evento evento) {
        eventos.modificar(evento, evento.getId());
    }

    public void eliminarEvento(int id) {
        eventos.eliminar(id);
    }

    public Evento buscarEvento(int id) {
        return eventos.buscar(id);
    }
    
    ///////////////
    //*Visitante*//
    ///////////////
    public void agregarVisitante(Visitante visitante) {
        visitantes.agregar(visitante);
    }

    public void modificarVisitante(Visitante visitante) {
        visitantes.modificar(visitante, visitante.getId());
    }

    public void eliminarVisitante(int id) {
        visitantes.eliminar(id);
    }

    public Visitante buscarVisitante(int id) {
        return visitantes.buscar(id);
    }

    //Metodos Publicos//
    @Override
    public String toString() {
        return "Zoologico{" + "habitats=" + habitats + ", animales=" + animales + ", alimentaciones=" + alimentaciones + ", eventos=" + eventos + ", visitantes=" + visitantes + '}';
    }
    
    
}
