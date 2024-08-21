/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.proyectofinal;

import clases.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabiola
 */
public class JFrame_Principal extends javax.swing.JFrame {

    private Zoologico miZoologico;
    
    /**
     * Creates new form JFrame_Principal
     */
    public JFrame_Principal() {
        
        
        initComponents();
        PrecargaDatosZoologico();
        
    }
    
    public void PrecargaDatosZoologico(){
    
        //Crea el Zoologico
        miZoologico = new Zoologico();
        
        //Crear Hábitats
        Habitat selvaTropical = new Habitat(1, "Selva Tropical", "Tropical", 5);
        Habitat desierto = new Habitat(2, "Desierto", "Árido", 3);
        Habitat sabana = new Habitat(3, "Sabana", "Semiárido", 4);
        Habitat acuario = new Habitat(4, "Acuario", "Acuático", 8);
        miZoologico.agregarHabitat(selvaTropical);
        miZoologico.agregarHabitat(desierto);
        miZoologico.agregarHabitat(sabana);
        miZoologico.agregarHabitat(acuario);
        
        //Crear Alimentaciones
        Alimentacion alimentacion1 = new Alimentacion(1, "08:00", "Hierba", 5, "Diaria");
        Alimentacion alimentacion2 = new Alimentacion(2, "12:00", "Carne", 3, "Diaria");
        Alimentacion alimentacion3 = new Alimentacion(3, "18:00", "Frutas", 4, "Semanal");
        Alimentacion alimentacion4 = new Alimentacion(4, "20:00", "Peces", 2, "Semanal");
        miZoologico.agregarAlimentacion(alimentacion1);
        miZoologico.agregarAlimentacion(alimentacion2);
        miZoologico.agregarAlimentacion(alimentacion3);
        miZoologico.agregarAlimentacion(alimentacion4);
        
        //Crear Eventos
        Evento evento1 = new Evento(1, "Concierto de Verano", "08-15-2024", "Concierto al aire libre con bandas locales.");
        Evento evento2 = new Evento(2, "Feria de Otoño", "22-09-2024", "Feria con juegos, comida y actividades para toda la familia.");
        Evento evento3 = new Evento(3, "Taller de Fotografía", "10-10-2024", "Taller intensivo de fotografía de naturaleza.");
        Evento evento4 = new Evento(4, "Maratón de Invierno", "05-12-2024", "Maratón de 10km por los caminos del zoológico.");
        miZoologico.agregarEvento(evento1);
        miZoologico.agregarEvento(evento2);
        miZoologico.agregarEvento(evento3);
        miZoologico.agregarEvento(evento4);

        //Crear Visitantes
        Visitante visitante1 = new Visitante(1, "Juan Pérez", 30, "juan.perez@example.com", "01-01-2024");
        Visitante visitante2 = new Visitante(2, "María López", 25, "maria.lopez@example.com", "02-02-2024");
        Visitante visitante3 = new Visitante(3, "Carlos García", 40, "carlos.garcia@example.com", "03-03-2024");
        Visitante visitante4 = new Visitante(4, "Ana Sánchez", 35, "ana.sanchez@example.com", "04-04-2024");
        miZoologico.agregarVisitante(visitante1);
        miZoologico.agregarVisitante(visitante2);
        miZoologico.agregarVisitante(visitante3);
        miZoologico.agregarVisitante(visitante4);
        
        //Crear Animales
        Animal animal1 = new Animal(1, "Tigre", "Panthera tigris", 4,  selvaTropical, alimentacion2);
        Animal animal2 = new Animal(2, "Elefante", "Loxodonta africana", 22, sabana, alimentacion1);
        Animal animal3 = new Animal(3, "Camello", "Camelus dromedarius", 9, desierto, alimentacion1);
        Animal animal4 = new Animal(4, "Tiburón", "Carcharodon carcharias", 13, acuario, alimentacion4);
        miZoologico.agregarAnimal(animal1);
        miZoologico.agregarAnimal(animal2);
        miZoologico.agregarAnimal(animal3);
        miZoologico.agregarAnimal(animal4);
    
        /*
        //Inicializa ComboBox//
        DefaultComboBoxModel<Habitat> modeloHabitats = new DefaultComboBoxModel<>();
        //modeloHabitats.addElement(null);  // Añadir un elemento vacío
        modeloHabitats.addElement(selvaTropical);
        modeloHabitats.addElement(desierto);
        modeloHabitats.addElement(sabana);
        modeloHabitats.addElement(acuario);
        jComboHabitatAnimal.setModel(modeloHabitats);

        DefaultComboBoxModel<Alimentacion> modeloAlimentaciones = new DefaultComboBoxModel<>();
        //modeloAlimentacion.addElement(null);  // Añadir un elemento vacío
        modeloAlimentaciones.addElement(alimentacion1);
        modeloAlimentaciones.addElement(alimentacion2);
        modeloAlimentaciones.addElement(alimentacion3);
        modeloAlimentaciones.addElement(alimentacion4);
        jComboAlimentacionAnimal.setModel(modeloAlimentaciones);        
        */
    }

    public void LimpiaTextHabitat() {
        txtFIdHabitat.setText("");
        txtFNombreHabitat.setText("");
        txtFTipoAmbienteHabitat.setText("");
        txtFCapacidadHabitat.setText("");
    }

    public void LimpiaTextAlimentacion() {
        txtFIdAlimentacion.setText("");     
        txtFHorarioAlimentacion.setText("");
        txtFAlimentoAlimentacion.setText("");
        txtFFrecuenciaAlimentacion.setText("");
        txtFCantidadAlimentacion.setText("");
    }

    
    public void LimpiaTextEvento() {
        txtFIdEvento.setText("");     
        txtFNombreEvento.setText("");
        txtFFechaEvento.setText("");
        txtFDescripcionEvento.setText("");
    }    
    
    public void LimpiaTextVisitante() {
        txtFIdVisitante.setText("");     
        txtFNombreVisitante.setText("");
        txtFCorreoVisitante.setText("");
        txtFEdadVisitante.setText("");
        txtFFechaIngresoVisitante.setText("");
    }        

    public void LimpiaTextAnimal() {
        txtFIdAnimal.setText("");     
        txtFNombreAnimal.setText("");
        txtFEspecieAnimal.setText("");
        txtFEdadAnimal.setText("");
        //Habitat
        jComboHabitatAnimal.setSelectedIndex(-1);
        //Alimentacion
        jComboAlimentacionAnimal.setSelectedIndex(-1);
    }   

    public void ActualizarComboxAnimalesHabitat() {
        //ComboHabitat
        DefaultComboBoxModel<Habitat> modeloHabitats = new DefaultComboBoxModel<>();
        for (int i=0;i<miZoologico.getHabitats().getCapacidad();i++){
            if (miZoologico.getHabitats().buscar(i)!=null){
                modeloHabitats.addElement(miZoologico.getHabitats().buscar(i));
            }
        }        
        jComboHabitatAnimal.setModel(modeloHabitats);
    }

    public void ActualizarComboxAnimalesAlimentacion() {
        //ComboAlimentacion
        DefaultComboBoxModel<Alimentacion> modeloAlimentaciones = new DefaultComboBoxModel<>();
        for (int i=0;i<miZoologico.getAlimentaciones().getCapacidad();i++){
            if (miZoologico.getAlimentaciones().buscar(i)!=null){
                modeloAlimentaciones.addElement(miZoologico.getAlimentaciones().buscar(i));
            }
        }         
        jComboAlimentacionAnimal.setModel(modeloAlimentaciones);        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelRegistro = new javax.swing.JTabbedPane();
        jPanelRegistroAlimentaciones = new javax.swing.JPanel();
        jPanelRegistroAlimentacion = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFCantidadAlimentacion = new java.awt.TextField();
        txtFHorarioAlimentacion = new java.awt.TextField();
        txtFAlimentoAlimentacion = new java.awt.TextField();
        txtFIdAlimentacion = new java.awt.TextField();
        btnAgregarAlimentacion = new javax.swing.JButton();
        btnModificarAlimentacion = new javax.swing.JButton();
        btnEliminarAlimentacion = new javax.swing.JButton();
        btnBuscarAlimentacion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListAlimentaciones = new javax.swing.JList<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        btnVisualizarAlimentacion = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtFFrecuenciaAlimentacion = new java.awt.TextField();
        jPanelRegistroEventos = new javax.swing.JPanel();
        jPanelRegistroAlimentacion1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtFNombreEvento = new java.awt.TextField();
        txtFFechaEvento = new java.awt.TextField();
        txtFIdEvento = new java.awt.TextField();
        btnAgregarEvento = new javax.swing.JButton();
        btnModificarEvento = new javax.swing.JButton();
        btnEliminarEvento = new javax.swing.JButton();
        btnBuscarEvento = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListEventos = new javax.swing.JList<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        btnVisualizarEvento = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtFDescripcionEvento = new java.awt.TextField();
        jPanelRegistroHabitats = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFCapacidadHabitat = new java.awt.TextField();
        txtFNombreHabitat = new java.awt.TextField();
        txtFTipoAmbienteHabitat = new java.awt.TextField();
        txtFIdHabitat = new java.awt.TextField();
        btnAgregarHabitat = new javax.swing.JButton();
        btnModificarHabitat = new javax.swing.JButton();
        btnEliminarHabitat = new javax.swing.JButton();
        btnBuscarHabitat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHabitats = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnVisualizarHabitat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanelRegistroHabitats1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFEdadVisitante = new java.awt.TextField();
        txtFNombreVisitante = new java.awt.TextField();
        txtFCorreoVisitante = new java.awt.TextField();
        txtFIdVisitante = new java.awt.TextField();
        btnAgregarVisitante = new javax.swing.JButton();
        btnModificarVisitante = new javax.swing.JButton();
        btnEliminarVisitante = new javax.swing.JButton();
        btnBuscarVisitante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListVisitantes = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        btnVisualizarVisitante = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtFFechaIngresoVisitante = new java.awt.TextField();
        jPanel2 = new javax.swing.JPanel();
        jPanelRegistroHabitats2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtFEdadAnimal = new java.awt.TextField();
        txtFNombreAnimal = new java.awt.TextField();
        txtFEspecieAnimal = new java.awt.TextField();
        txtFIdAnimal = new java.awt.TextField();
        btnAgregarAnimal = new javax.swing.JButton();
        btnModificarAnimal = new javax.swing.JButton();
        btnEliminarAnimal = new javax.swing.JButton();
        btnBuscarAnimal = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListAnimal = new javax.swing.JList<>();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        btnVisualizarAnimal = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboHabitatAnimal = new javax.swing.JComboBox<>();
        jComboAlimentacionAnimal = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableMapa = new javax.swing.JTable();
        jButtonMapa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Sistema de Administración del Zoológico");

        jPanelRegistro.setName(""); // NOI18N

        jLabel13.setText("Id:");

        jLabel14.setText("Horario:");

        jLabel15.setText("Alimento:");

        jLabel16.setText("Cantidad");

        txtFCantidadAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCantidadAlimentacionActionPerformed(evt);
            }
        });

        txtFHorarioAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFHorarioAlimentacionActionPerformed(evt);
            }
        });

        txtFAlimentoAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAlimentoAlimentacionActionPerformed(evt);
            }
        });

        txtFIdAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIdAlimentacionActionPerformed(evt);
            }
        });

        btnAgregarAlimentacion.setText("Agregar");
        btnAgregarAlimentacion.setActionCommand("");
        btnAgregarAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlimentacionActionPerformed(evt);
            }
        });

        btnModificarAlimentacion.setText("Modificar");
        btnModificarAlimentacion.setActionCommand("");
        btnModificarAlimentacion.setEnabled(false);
        btnModificarAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlimentacionActionPerformed(evt);
            }
        });

        btnEliminarAlimentacion.setText("Eliminar");
        btnEliminarAlimentacion.setActionCommand("");
        btnEliminarAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlimentacionActionPerformed(evt);
            }
        });

        btnBuscarAlimentacion.setText("Buscar");
        btnBuscarAlimentacion.setActionCommand("");
        btnBuscarAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlimentacionActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jListAlimentaciones);

        jLabel17.setText("Despliegue del arreglo de Alimentaciones");

        btnVisualizarAlimentacion.setText("Visualizar");
        btnVisualizarAlimentacion.setActionCommand("");
        btnVisualizarAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarAlimentacionActionPerformed(evt);
            }
        });

        jLabel18.setText("Frecuencia:");

        txtFFrecuenciaAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFrecuenciaAlimentacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroAlimentacionLayout = new javax.swing.GroupLayout(jPanelRegistroAlimentacion);
        jPanelRegistroAlimentacion.setLayout(jPanelRegistroAlimentacionLayout);
        jPanelRegistroAlimentacionLayout.setHorizontalGroup(
            jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                .addComponent(btnEliminarAlimentacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarAlimentacion))
                            .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                .addComponent(btnAgregarAlimentacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarAlimentacion))
                            .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFCantidadAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFAlimentoAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFHorarioAlimentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFIdAlimentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFFrecuenciaAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnVisualizarAlimentacion)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRegistroAlimentacionLayout.setVerticalGroup(
            jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFAlimentoAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                                        .addComponent(txtFIdAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFHorarioAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtFFrecuenciaAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtFCantidadAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarAlimentacion)
                            .addComponent(btnModificarAlimentacion))
                        .addGap(3, 3, 3)
                        .addComponent(btnVisualizarAlimentacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroAlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarAlimentacion)
                            .addComponent(btnBuscarAlimentacion)))
                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroAlimentacionLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelRegistroAlimentacionesLayout = new javax.swing.GroupLayout(jPanelRegistroAlimentaciones);
        jPanelRegistroAlimentaciones.setLayout(jPanelRegistroAlimentacionesLayout);
        jPanelRegistroAlimentacionesLayout.setHorizontalGroup(
            jPanelRegistroAlimentacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
            .addGroup(jPanelRegistroAlimentacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRegistroAlimentacionesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelRegistroAlimentacionesLayout.setVerticalGroup(
            jPanelRegistroAlimentacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(jPanelRegistroAlimentacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRegistroAlimentacionesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelRegistro.addTab("Registro de Alimentaciones", jPanelRegistroAlimentaciones);

        jLabel19.setText("Id:");

        jLabel20.setText("Nombre:");

        jLabel21.setText("Fecha:");

        txtFNombreEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNombreEventoActionPerformed(evt);
            }
        });

        txtFFechaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFechaEventoActionPerformed(evt);
            }
        });

        txtFIdEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIdEventoActionPerformed(evt);
            }
        });

        btnAgregarEvento.setText("Agregar");
        btnAgregarEvento.setActionCommand("");
        btnAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEventoActionPerformed(evt);
            }
        });

        btnModificarEvento.setText("Modificar");
        btnModificarEvento.setActionCommand("");
        btnModificarEvento.setEnabled(false);
        btnModificarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEventoActionPerformed(evt);
            }
        });

        btnEliminarEvento.setText("Eliminar");
        btnEliminarEvento.setActionCommand("");
        btnEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEventoActionPerformed(evt);
            }
        });

        btnBuscarEvento.setText("Buscar");
        btnBuscarEvento.setActionCommand("");
        btnBuscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEventoActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jListEventos);

        jLabel23.setText("Despliegue del arreglo de Eventos");

        btnVisualizarEvento.setText("Visualizar");
        btnVisualizarEvento.setActionCommand("");
        btnVisualizarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEventoActionPerformed(evt);
            }
        });

        jLabel24.setText("Descripción:");

        txtFDescripcionEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFDescripcionEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroAlimentacion1Layout = new javax.swing.GroupLayout(jPanelRegistroAlimentacion1);
        jPanelRegistroAlimentacion1.setLayout(jPanelRegistroAlimentacion1Layout);
        jPanelRegistroAlimentacion1Layout.setHorizontalGroup(
            jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                                .addComponent(btnEliminarEvento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarEvento))
                            .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                                .addComponent(btnAgregarEvento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarEvento))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNombreEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFIdEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFDescripcionEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFFechaEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnVisualizarEvento)))
                .addGap(37, 37, 37)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRegistroAlimentacion1Layout.setVerticalGroup(
            jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFFechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                                .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                                        .addComponent(txtFIdEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(txtFDescripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarEvento)
                            .addComponent(btnModificarEvento))
                        .addGap(3, 3, 3)
                        .addComponent(btnVisualizarEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroAlimentacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarEvento)
                            .addComponent(btnBuscarEvento)))
                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroAlimentacion1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.getAccessibleContext().setAccessibleName("Horario");

        javax.swing.GroupLayout jPanelRegistroEventosLayout = new javax.swing.GroupLayout(jPanelRegistroEventos);
        jPanelRegistroEventos.setLayout(jPanelRegistroEventosLayout);
        jPanelRegistroEventosLayout.setHorizontalGroup(
            jPanelRegistroEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
            .addGroup(jPanelRegistroEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRegistroEventosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroAlimentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelRegistroEventosLayout.setVerticalGroup(
            jPanelRegistroEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(jPanelRegistroEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRegistroEventosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroAlimentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelRegistro.addTab("Registro de Eventos", jPanelRegistroEventos);

        jLabel1.setText("Id:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Tipo Ambiente:");

        jLabel5.setText("Capacidad:");

        txtFCapacidadHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCapacidadHabitatActionPerformed(evt);
            }
        });

        txtFNombreHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNombreHabitatActionPerformed(evt);
            }
        });

        txtFTipoAmbienteHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFTipoAmbienteHabitatActionPerformed(evt);
            }
        });

        txtFIdHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIdHabitatActionPerformed(evt);
            }
        });

        btnAgregarHabitat.setText("Agregar");
        btnAgregarHabitat.setActionCommand("");
        btnAgregarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabitatActionPerformed(evt);
            }
        });

        btnModificarHabitat.setText("Modificar");
        btnModificarHabitat.setActionCommand("");
        btnModificarHabitat.setEnabled(false);
        btnModificarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarHabitatActionPerformed(evt);
            }
        });

        btnEliminarHabitat.setText("Eliminar");
        btnEliminarHabitat.setActionCommand("");
        btnEliminarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHabitatActionPerformed(evt);
            }
        });

        btnBuscarHabitat.setText("Buscar");
        btnBuscarHabitat.setActionCommand("");
        btnBuscarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHabitatActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListHabitats);

        jLabel6.setText("Despliegue del arreglo de Habitats");

        btnVisualizarHabitat.setText("Visualizar");
        btnVisualizarHabitat.setActionCommand("");
        btnVisualizarHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarHabitatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroHabitatsLayout = new javax.swing.GroupLayout(jPanelRegistroHabitats);
        jPanelRegistroHabitats.setLayout(jPanelRegistroHabitatsLayout);
        jPanelRegistroHabitatsLayout.setHorizontalGroup(
            jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                                .addComponent(btnEliminarHabitat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarHabitat))
                            .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                                .addComponent(btnAgregarHabitat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarHabitat))
                            .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroHabitatsLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFTipoAmbienteHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroHabitatsLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNombreHabitat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFIdHabitat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnVisualizarHabitat)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelRegistroHabitatsLayout.setVerticalGroup(
            jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFTipoAmbienteHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                                .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                                        .addComponent(txtFIdHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFNombreHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtFCapacidadHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarHabitat)
                            .addComponent(btnModificarHabitat))
                        .addGap(3, 3, 3)
                        .addComponent(btnVisualizarHabitat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroHabitatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarHabitat)
                            .addComponent(btnBuscarHabitat)))
                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroHabitatsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregarHabitat.getAccessibleContext().setAccessibleName("btnAgregarHabitat");
        btnAgregarHabitat.getAccessibleContext().setAccessibleDescription("");

        jPanelRegistro.addTab("Registro de Habitats", jPanelRegistroHabitats);

        jLabel7.setText("Id:");

        jLabel8.setText("Nombre:");

        jLabel9.setText("Correo electrónico:");

        jLabel10.setText("Edad:");

        txtFEdadVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEdadVisitanteActionPerformed(evt);
            }
        });

        txtFNombreVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNombreVisitanteActionPerformed(evt);
            }
        });

        txtFCorreoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCorreoVisitanteActionPerformed(evt);
            }
        });

        txtFIdVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIdVisitanteActionPerformed(evt);
            }
        });

        btnAgregarVisitante.setText("Agregar");
        btnAgregarVisitante.setActionCommand("");
        btnAgregarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVisitanteActionPerformed(evt);
            }
        });

        btnModificarVisitante.setText("Modificar");
        btnModificarVisitante.setActionCommand("");
        btnModificarVisitante.setEnabled(false);
        btnModificarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVisitanteActionPerformed(evt);
            }
        });

        btnEliminarVisitante.setText("Eliminar");
        btnEliminarVisitante.setActionCommand("");
        btnEliminarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVisitanteActionPerformed(evt);
            }
        });

        btnBuscarVisitante.setText("Buscar");
        btnBuscarVisitante.setActionCommand("");
        btnBuscarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVisitanteActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListVisitantes);

        jLabel11.setText("Despliegue del arreglo de Visitantes");

        btnVisualizarVisitante.setText("Visualizar");
        btnVisualizarVisitante.setActionCommand("");
        btnVisualizarVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVisitanteActionPerformed(evt);
            }
        });

        jLabel12.setText("Fecha de Ingreso:");

        txtFFechaIngresoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFechaIngresoVisitanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroHabitats1Layout = new javax.swing.GroupLayout(jPanelRegistroHabitats1);
        jPanelRegistroHabitats1.setLayout(jPanelRegistroHabitats1Layout);
        jPanelRegistroHabitats1Layout.setHorizontalGroup(
            jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                .addComponent(btnEliminarVisitante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarVisitante))
                            .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                .addComponent(btnAgregarVisitante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarVisitante))
                            .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFEdadVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFFechaIngresoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroHabitats1Layout.createSequentialGroup()
                                .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(txtFIdVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtFNombreVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFCorreoVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnVisualizarVisitante)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelRegistroHabitats1Layout.setVerticalGroup(
            jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFCorreoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                                        .addComponent(txtFIdVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFNombreVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtFEdadVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtFFechaIngresoVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarVisitante)
                            .addComponent(btnModificarVisitante))
                        .addGap(3, 3, 3)
                        .addComponent(btnVisualizarVisitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroHabitats1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarVisitante)
                            .addComponent(btnBuscarVisitante)))
                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroHabitats1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroHabitats1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroHabitats1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelRegistro.addTab("Registro de Visitantes", jPanel3);

        jLabel22.setText("Id:");

        jLabel25.setText("Nombre:");

        jLabel26.setText("Especie:");

        jLabel27.setText("Edad:");
        jLabel27.setToolTipText("");

        txtFEdadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEdadAnimalActionPerformed(evt);
            }
        });

        txtFNombreAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNombreAnimalActionPerformed(evt);
            }
        });

        txtFEspecieAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEspecieAnimalActionPerformed(evt);
            }
        });

        txtFIdAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIdAnimalActionPerformed(evt);
            }
        });

        btnAgregarAnimal.setText("Agregar");
        btnAgregarAnimal.setActionCommand("");
        btnAgregarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAnimalActionPerformed(evt);
            }
        });

        btnModificarAnimal.setText("Modificar");
        btnModificarAnimal.setActionCommand("");
        btnModificarAnimal.setEnabled(false);
        btnModificarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAnimalActionPerformed(evt);
            }
        });

        btnEliminarAnimal.setText("Eliminar");
        btnEliminarAnimal.setActionCommand("");
        btnEliminarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAnimalActionPerformed(evt);
            }
        });

        btnBuscarAnimal.setText("Buscar");
        btnBuscarAnimal.setActionCommand("");
        btnBuscarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAnimalActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(jListAnimal);

        jLabel28.setText("Despliegue del arreglo de Animales");

        btnVisualizarAnimal.setText("Visualizar");
        btnVisualizarAnimal.setActionCommand("");
        btnVisualizarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarAnimalActionPerformed(evt);
            }
        });

        jLabel29.setText("Habitat:");

        jLabel30.setText("Alimentacion:");

        jComboHabitatAnimal.setToolTipText("");
        jComboHabitatAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboHabitatAnimalMouseClicked(evt);
            }
        });

        jComboAlimentacionAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboAlimentacionAnimalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroHabitats2Layout = new javax.swing.GroupLayout(jPanelRegistroHabitats2);
        jPanelRegistroHabitats2.setLayout(jPanelRegistroHabitats2Layout);
        jPanelRegistroHabitats2Layout.setHorizontalGroup(
            jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregarAnimal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFEdadAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnBuscarAnimal)
                                            .addComponent(btnModificarAnimal))
                                        .addGap(8, 8, 8))))
                            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFEspecieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFIdAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFNombreAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboAlimentacionAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboHabitatAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                        .addComponent(btnEliminarAnimal)
                        .addGap(74, 74, 74)
                        .addComponent(btnVisualizarAnimal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(636, 636, 636))
        );
        jPanelRegistroHabitats2Layout.setVerticalGroup(
            jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel25)
                                .addGap(14, 14, 14))
                            .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                                .addComponent(txtFIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(txtFNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFEspecieAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(txtFEdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jComboHabitatAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jComboAlimentacionAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarAnimal)
                            .addComponent(btnModificarAnimal))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualizarAnimal)
                    .addGroup(jPanelRegistroHabitats2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelRegistroHabitats2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarAnimal)
                            .addComponent(btnBuscarAnimal))))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroHabitats2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRegistroHabitats2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelRegistro.addTab("Registro de Animales", jPanel2);

        jTableMapa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTableMapa);

        jButtonMapa.setBackground(new java.awt.Color(0, 255, 153));
        jButtonMapa.setText("Ver MAPA");
        jButtonMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButtonMapa)
                .addGap(95, 95, 95)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButtonMapa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanelRegistro.addTab("Mapa de los Animales en el Zoologico", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanelRegistro.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtFCantidadAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCantidadAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCantidadAlimentacionActionPerformed

    private void txtFHorarioAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFHorarioAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFHorarioAlimentacionActionPerformed

    private void txtFAlimentoAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAlimentoAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAlimentoAlimentacionActionPerformed

    private void txtFIdAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIdAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIdAlimentacionActionPerformed

    private void btnAgregarAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlimentacionActionPerformed
        
        int nuevoId=0;
        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getAlimentaciones().getCapacidad();i++){
            if (miZoologico.getAlimentaciones().buscar(i)!=null){
                nuevoId=miZoologico.getAlimentaciones().buscar(i).getId()+1;
            }
        }

        txtFIdAlimentacion.setText(String.valueOf(nuevoId));
        
        if (txtFHorarioAlimentacion.getText().isBlank() || txtFAlimentoAlimentacion.getText().isBlank() || txtFFrecuenciaAlimentacion.getText().isBlank() || txtFCantidadAlimentacion.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }
        
        String horario = txtFHorarioAlimentacion.getText();
        String alimento = txtFAlimentoAlimentacion.getText();
        String frecuencia = txtFFrecuenciaAlimentacion.getText();
        int cantidad = Integer.parseInt(txtFCantidadAlimentacion.getText());

        Alimentacion miNuevaAlimentacion = new Alimentacion(nuevoId,horario,alimento,cantidad,frecuencia);
        miZoologico.agregarAlimentacion(miNuevaAlimentacion);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getAlimentaciones().getCapacidad();i++){
            if (miZoologico.getAlimentaciones().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getAlimentaciones().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListAlimentaciones.setModel(modeloLista);
        btnModificarAlimentacion.setEnabled(false);
        LimpiaTextAlimentacion();
    }//GEN-LAST:event_btnAgregarAlimentacionActionPerformed

    private void btnModificarAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlimentacionActionPerformed
        // TODO add your handling code here:
        if (txtFHorarioAlimentacion.getText().isBlank() || txtFAlimentoAlimentacion.getText().isBlank() || txtFFrecuenciaAlimentacion.getText().isBlank() || txtFCantidadAlimentacion.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }
        
        int id =Integer.parseInt(txtFIdAlimentacion.getText());
        String horario = txtFHorarioAlimentacion.getText();
        String alimento = txtFAlimentoAlimentacion.getText();
        String frecuencia = txtFFrecuenciaAlimentacion.getText();
        int cantidad = Integer.parseInt(txtFCantidadAlimentacion.getText());
        
        
        Alimentacion miNuevaAlimentacion = new Alimentacion(id,horario,alimento,cantidad,frecuencia);
        miZoologico.modificarAlimentacion(miNuevaAlimentacion);
        
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" modificado exitosamente!!!");
        this.jListAlimentaciones.setModel(modeloLista);
        
        btnModificarAlimentacion.setEnabled(false);
        LimpiaTextAlimentacion();

    }//GEN-LAST:event_btnModificarAlimentacionActionPerformed

    private void btnEliminarAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlimentacionActionPerformed
        // TODO add your handling code here:
        if (txtFIdAlimentacion.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdAlimentacion.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdAlimentacion.getText());

        if (miZoologico.getAlimentaciones().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        miZoologico.eliminarAlimentacion(id);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" eliminado exitosamente!!!");
        
        btnModificarAlimentacion.setEnabled(false);
        this.jListAlimentaciones.setModel(modeloLista);
        LimpiaTextAlimentacion();
    }//GEN-LAST:event_btnEliminarAlimentacionActionPerformed

    private void btnBuscarAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlimentacionActionPerformed
        // TODO add your handling code here:
        if (txtFIdAlimentacion.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdAlimentacion.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdAlimentacion.getText());

        if (miZoologico.getAlimentaciones().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        
        txtFHorarioAlimentacion.setText(miZoologico.getAlimentaciones().buscar(id).getHorario());
        txtFAlimentoAlimentacion.setText(miZoologico.getAlimentaciones().buscar(id).getAlimento());
        txtFFrecuenciaAlimentacion.setText(miZoologico.getAlimentaciones().buscar(id).getFrecuencia());
        txtFCantidadAlimentacion.setText(String.valueOf(miZoologico.getAlimentaciones().buscar(id).getCantidad()));
        
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" encontrado exitosamente!!!");
        this.jListAlimentaciones.setModel(modeloLista);

        //Nos habilta el boton de modificar
        btnModificarAlimentacion.setEnabled(true);
        
    }//GEN-LAST:event_btnBuscarAlimentacionActionPerformed

    private void btnVisualizarAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarAlimentacionActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        for (int i=0;i<miZoologico.getAlimentaciones().getCapacidad();i++){
            if (miZoologico.getAlimentaciones().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getAlimentaciones().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListAlimentaciones.setModel(modeloLista);
        LimpiaTextAlimentacion();

    }//GEN-LAST:event_btnVisualizarAlimentacionActionPerformed

    private void txtFFrecuenciaAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFrecuenciaAlimentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFrecuenciaAlimentacionActionPerformed

    private void txtFNombreEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNombreEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNombreEventoActionPerformed

    private void txtFFechaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFechaEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFechaEventoActionPerformed

    private void txtFIdEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIdEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIdEventoActionPerformed

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
        // TODO add your handling code here:
        
        int nuevoId=0;
        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getEventos().getCapacidad();i++){
            if (miZoologico.getEventos().buscar(i)!=null){
                nuevoId=miZoologico.getEventos().buscar(i).getId()+1;
            }
        }

        txtFIdEvento.setText(String.valueOf(nuevoId));

        
        if (txtFNombreEvento.getText().isBlank() || txtFFechaEvento.getText().isBlank() || txtFDescripcionEvento.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }
        
        String nombre = txtFNombreEvento.getText();
        String fecha = txtFFechaEvento.getText();
        String descripcion = txtFDescripcionEvento.getText();

        Evento miNuevoEvento = new Evento(nuevoId, nombre, fecha, descripcion);
        miZoologico.agregarEvento(miNuevoEvento);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getEventos().getCapacidad();i++){
            if (miZoologico.getEventos().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getEventos().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListEventos.setModel(modeloLista);
        btnModificarEvento.setEnabled(false);
        LimpiaTextEvento();        
    }//GEN-LAST:event_btnAgregarEventoActionPerformed

    private void btnModificarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEventoActionPerformed
        // TODO add your handling code here:

        if (txtFNombreEvento.getText().isBlank() || txtFFechaEvento.getText().isBlank() || txtFDescripcionEvento.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;            
        }
        
        int id =Integer.parseInt(txtFIdEvento.getText());
        String nombre = txtFNombreEvento.getText();
        String fecha = txtFFechaEvento.getText();
        String descripcion = txtFDescripcionEvento.getText();

        
        Evento miNuevoEvento = new Evento(id, nombre, fecha, descripcion);
        miZoologico.modificarEvento(miNuevoEvento);
        
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" modificado exitosamente!!!");
        this.jListEventos.setModel(modeloLista);
        
        btnModificarEvento.setEnabled(false);
        LimpiaTextEvento();

    }//GEN-LAST:event_btnModificarEventoActionPerformed

    private void btnEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEventoActionPerformed
                
        if (txtFIdEvento.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdEvento.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdEvento.getText());

        if (miZoologico.getEventos().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        miZoologico.eliminarEvento(id);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" eliminado exitosamente!!!");
        
        btnModificarEvento.setEnabled(false);
        this.jListEventos.setModel(modeloLista);
        LimpiaTextEvento();
    }//GEN-LAST:event_btnEliminarEventoActionPerformed

    private void btnBuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEventoActionPerformed
        // TODO add your handling code here:

        if (txtFIdEvento.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdEvento.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdEvento.getText());

        if (miZoologico.getEventos().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        txtFNombreEvento.setText(miZoologico.getEventos().buscar(id).getNombre());
        txtFFechaEvento.setText(miZoologico.getEventos().buscar(id).getFecha());
        txtFDescripcionEvento.setText(miZoologico.getEventos().buscar(id).getDescripcion());
        
        
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" encontrado exitosamente!!!");
        this.jListEventos.setModel(modeloLista);

        //Nos habilta el boton de modificar
        btnModificarEvento.setEnabled(true);                
    }//GEN-LAST:event_btnBuscarEventoActionPerformed

    private void btnVisualizarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEventoActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        for (int i=0;i<miZoologico.getEventos().getCapacidad();i++){
            if (miZoologico.getEventos().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getEventos().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListEventos.setModel(modeloLista);
        LimpiaTextEvento();
    }//GEN-LAST:event_btnVisualizarEventoActionPerformed

    private void txtFDescripcionEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFDescripcionEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFDescripcionEventoActionPerformed

    private void btnVisualizarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarHabitatActionPerformed
        // TODO add your handling code here:

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        for (int i=0;i<miZoologico.getHabitats().getCapacidad();i++){
            if (miZoologico.getHabitats().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getHabitats().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListHabitats.setModel(modeloLista);
        LimpiaTextHabitat();
    }//GEN-LAST:event_btnVisualizarHabitatActionPerformed

    private void btnBuscarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHabitatActionPerformed
        // TODO add your handling code here:

        if (txtFIdHabitat.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdHabitat.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdHabitat.getText());

        if (miZoologico.getHabitats().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        txtFNombreHabitat.setText(miZoologico.getHabitats().buscar(id).getNombre());
        txtFTipoAmbienteHabitat.setText(miZoologico.getHabitats().buscar(id).getTipoAmbiente());
        txtFCapacidadHabitat.setText(String.valueOf(miZoologico.getHabitats().buscar(id).getCapacidad()));

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" encontrado exitosamente!!!");
        this.jListHabitats.setModel(modeloLista);

        //Nos habilta el boton de modificar
        btnModificarHabitat.setEnabled(true);
    }//GEN-LAST:event_btnBuscarHabitatActionPerformed

    private void btnEliminarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHabitatActionPerformed
        // TODO add your handling code here:

        if (txtFIdHabitat.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdHabitat.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdHabitat.getText());

        if (miZoologico.getHabitats().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        miZoologico.eliminarHabitat(id);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" eliminado exitosamente!!!");

        btnModificarHabitat.setEnabled(false);
        this.jListHabitats.setModel(modeloLista);
        LimpiaTextHabitat();
    }//GEN-LAST:event_btnEliminarHabitatActionPerformed

    private void btnModificarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarHabitatActionPerformed
        // TODO add your handling code here:

        if (txtFIdHabitat.getText().isEmpty() || txtFNombreHabitat.getText().isBlank() || txtFTipoAmbienteHabitat.getText().isBlank() || txtFCapacidadHabitat.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int id =Integer.parseInt(txtFIdHabitat.getText());
        String nombre = txtFNombreHabitat.getText();
        String tipoAmbiente = txtFTipoAmbienteHabitat.getText();
        int capacidad = Integer.parseInt(txtFCapacidadHabitat.getText());
        Habitat miNuevoHabitat = new Habitat(id, nombre, tipoAmbiente, capacidad);
        miZoologico.modificarHabitat(miNuevoHabitat);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" modificado exitosamente!!!");
        this.jListHabitats.setModel(modeloLista);

        btnModificarHabitat.setEnabled(false);
        LimpiaTextHabitat();
    }//GEN-LAST:event_btnModificarHabitatActionPerformed

    private void btnAgregarHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabitatActionPerformed
        // TODO add your handling code here:

        int nuevoId=0;
        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getHabitats().getCapacidad();i++){
            if (miZoologico.getHabitats().buscar(i)!=null){
                nuevoId=miZoologico.getHabitats().buscar(i).getId()+1;
            }
        }

        txtFIdHabitat.setText(String.valueOf(nuevoId));

        if (txtFNombreHabitat.getText().isBlank() || txtFTipoAmbienteHabitat.getText().isBlank() || txtFCapacidadHabitat.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String nombre = txtFNombreHabitat.getText();
        String tipoAmbiente = txtFTipoAmbienteHabitat.getText();
        int capacidad = Integer.parseInt(txtFCapacidadHabitat.getText());

        Habitat miNuevoHabitat = new Habitat(nuevoId, nombre, tipoAmbiente, capacidad);
        miZoologico.agregarHabitat(miNuevoHabitat);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getHabitats().getCapacidad();i++){
            if (miZoologico.getHabitats().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getHabitats().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListHabitats.setModel(modeloLista);
        btnModificarHabitat.setEnabled(false);
        LimpiaTextHabitat();
    }//GEN-LAST:event_btnAgregarHabitatActionPerformed

    private void txtFIdHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIdHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIdHabitatActionPerformed

    private void txtFTipoAmbienteHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFTipoAmbienteHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFTipoAmbienteHabitatActionPerformed

    private void txtFNombreHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNombreHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNombreHabitatActionPerformed

    private void txtFCapacidadHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCapacidadHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCapacidadHabitatActionPerformed

    private void txtFEdadVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEdadVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFEdadVisitanteActionPerformed

    private void txtFNombreVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNombreVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNombreVisitanteActionPerformed

    private void txtFCorreoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCorreoVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCorreoVisitanteActionPerformed

    private void txtFIdVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIdVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIdVisitanteActionPerformed

    private void btnAgregarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVisitanteActionPerformed
        // TODO add your handling code here:
        
        int nuevoId=0;
        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getVisitantes().getCapacidad();i++){
            if (miZoologico.getVisitantes().buscar(i)!=null){
                nuevoId=miZoologico.getVisitantes().buscar(i).getId()+1;
            }
        }

        txtFIdVisitante.setText(String.valueOf(nuevoId));

        
        if (txtFNombreVisitante.getText().isBlank() || txtFCorreoVisitante.getText().isBlank() || txtFEdadVisitante.getText().isBlank() || txtFFechaIngresoVisitante.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

             
        String nombre = txtFNombreVisitante.getText();
        int edad = Integer.parseInt(txtFEdadVisitante.getText());
        String correo = txtFCorreoVisitante.getText();
        String fecha = txtFFechaIngresoVisitante.getText();
        
        Visitante miNuevoVisitante = new Visitante(nuevoId,nombre,edad,correo,fecha);
        miZoologico.agregarVisitante(miNuevoVisitante);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getVisitantes().getCapacidad();i++){
            if (miZoologico.getVisitantes().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getVisitantes().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListVisitantes.setModel(modeloLista);
        btnModificarVisitante.setEnabled(false);
        LimpiaTextVisitante();        
    }//GEN-LAST:event_btnAgregarVisitanteActionPerformed

    private void btnModificarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVisitanteActionPerformed
        // TODO add your handling code here:

        
        if (txtFIdVisitante.getText().isEmpty() || txtFNombreVisitante.getText().isBlank() || txtFCorreoVisitante.getText().isBlank() || txtFEdadVisitante.getText().isBlank() || txtFFechaIngresoVisitante.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdVisitante.getText());
        String nombre = txtFNombreVisitante.getText();
        int edad = Integer.parseInt(txtFEdadVisitante.getText());
        String correo = txtFCorreoVisitante.getText();
        String fecha = txtFFechaIngresoVisitante.getText();
        
        Visitante miNuevoVisitante = new Visitante(id, nombre, edad, correo, fecha);
        miZoologico.modificarVisitante(miNuevoVisitante);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" modificado exitosamente!!!");
        this.jListVisitantes.setModel(modeloLista);

        btnModificarVisitante.setEnabled(false);
        LimpiaTextVisitante();
    }//GEN-LAST:event_btnModificarVisitanteActionPerformed

    private void btnEliminarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVisitanteActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:

        if (txtFIdVisitante.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdVisitante.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdVisitante.getText());

        if (miZoologico.getVisitantes().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        miZoologico.eliminarVisitante(id);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" eliminado exitosamente!!!");

        btnModificarVisitante.setEnabled(false);
        this.jListVisitantes.setModel(modeloLista);
        LimpiaTextVisitante();
        
    }//GEN-LAST:event_btnEliminarVisitanteActionPerformed

    private void btnBuscarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVisitanteActionPerformed
        // TODO add your handling code here:

        if (txtFIdVisitante.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdVisitante.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdVisitante.getText());

        if (miZoologico.getVisitantes().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        
        txtFNombreVisitante.setText(miZoologico.getVisitantes().buscar(id).getNombre());
        txtFCorreoVisitante.setText(miZoologico.getVisitantes().buscar(id).getCorreoElectronico());
        txtFEdadVisitante.setText(String.valueOf(miZoologico.getVisitantes().buscar(id).getEdad()));
        txtFFechaIngresoVisitante.setText(miZoologico.getVisitantes().buscar(id).getFechaIngreso());

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" encontrado exitosamente!!!");
        this.jListVisitantes.setModel(modeloLista);

        //Nos habilta el boton de modificar
        btnModificarVisitante.setEnabled(true);        
    }//GEN-LAST:event_btnBuscarVisitanteActionPerformed

    private void btnVisualizarVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVisitanteActionPerformed
        // TODO add your handling code here:

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        for (int i=0;i<miZoologico.getVisitantes().getCapacidad();i++){
            if (miZoologico.getVisitantes().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getVisitantes().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListVisitantes.setModel(modeloLista);
        LimpiaTextVisitante();
        
    }//GEN-LAST:event_btnVisualizarVisitanteActionPerformed

    private void txtFFechaIngresoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFechaIngresoVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFechaIngresoVisitanteActionPerformed

    private void btnVisualizarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarAnimalActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        for (int i=0;i<miZoologico.getAnimales().getCapacidad();i++){
            if (miZoologico.getAnimales().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getAnimales().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListAnimal.setModel(modeloLista);
        LimpiaTextAnimal();
        
    }//GEN-LAST:event_btnVisualizarAnimalActionPerformed

    private void btnBuscarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAnimalActionPerformed
        // TODO add your handling code here:
        if (txtFIdAnimal.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdAnimal.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdAnimal.getText());

        if (miZoologico.getAnimales().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        
        txtFNombreAnimal.setText(miZoologico.getAnimales().buscar(id).getNombre());
        txtFEspecieAnimal.setText(miZoologico.getAnimales().buscar(id).getEspecie());
        txtFEdadAnimal.setText(String.valueOf(miZoologico.getAnimales().buscar(id).getEdad()));
        jComboHabitatAnimal.setSelectedItem(miZoologico.getAnimales().buscar(id).getHabitat());
        jComboAlimentacionAnimal.setSelectedItem(miZoologico.getAnimales().buscar(id).getAlimentacion());

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" encontrado exitosamente!!!");
        this.jListAnimal.setModel(modeloLista);

        //Nos habilta el boton de modificar
        btnModificarAnimal.setEnabled(true);
        
    }//GEN-LAST:event_btnBuscarAnimalActionPerformed

    private void btnEliminarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAnimalActionPerformed

        // TODO add your handling code here:
        if (txtFIdAnimal.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no válido.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtFIdAnimal.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un id válido.", "Error: Id no es un numero.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id = Integer.parseInt(txtFIdAnimal.getText());

        if (miZoologico.getAnimales().buscar(id)==null)
        {
            JOptionPane.showMessageDialog(null, "El id ingresado no existe.", "Info: Id no existe.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        miZoologico.eliminarAnimal(id); 

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" eliminado exitosamente!!!");

        btnModificarAnimal.setEnabled(false);
        this.jListAnimal.setModel(modeloLista);
        LimpiaTextAnimal();
        
    }//GEN-LAST:event_btnEliminarAnimalActionPerformed

    private void btnModificarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAnimalActionPerformed

        // TODO add your handling code here:
        if (txtFNombreAnimal.getText().isBlank() || txtFEspecieAnimal.getText().isBlank() || txtFEdadAnimal.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int id =Integer.parseInt(txtFIdAnimal.getText());
        String nombre = txtFNombreAnimal.getText();
        String especie = txtFEspecieAnimal.getText();
        int edad = Integer.parseInt(txtFEdadAnimal.getText());
        Habitat elHabitat = (Habitat)jComboHabitatAnimal.getSelectedItem();
        Alimentacion laAlimentacion = (Alimentacion)jComboAlimentacionAnimal.getSelectedItem();

        Animal miNuevoAnimal = new Animal(id, nombre, especie, edad, elHabitat, laAlimentacion);
        miZoologico.modificarAnimal(miNuevoAnimal);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Id: "+id+" modificado exitosamente!!!");
        this.jListAnimal.setModel(modeloLista);

        btnModificarAnimal.setEnabled(false);
        LimpiaTextAnimal();

        
    }//GEN-LAST:event_btnModificarAnimalActionPerformed

    private void btnAgregarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAnimalActionPerformed
        // TODO add your handling code here:
        int nuevoId=0;
        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getAnimales().getCapacidad();i++){
            if (miZoologico.getAnimales().buscar(i)!=null){
                nuevoId=miZoologico.getAnimales().buscar(i).getId()+1;
            }
        }

        txtFIdAnimal.setText(String.valueOf(nuevoId));


        if (txtFNombreAnimal.getText().isBlank() || txtFEspecieAnimal.getText().isBlank() || txtFEdadAnimal.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos en blanco.", "Info: No dejar campos en blanco.", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String nombre = txtFNombreAnimal.getText();
        String especie = txtFEspecieAnimal.getText();
        int edad = Integer.parseInt(txtFEdadAnimal.getText());
        Habitat elHabitat = (Habitat)jComboHabitatAnimal.getSelectedItem();
        Alimentacion laAlimentacion = (Alimentacion)jComboAlimentacionAnimal.getSelectedItem();
                
        Animal miNuevoAnimal = new Animal(nuevoId, nombre, especie, edad, elHabitat, laAlimentacion);
        miZoologico.agregarAnimal(miNuevoAnimal);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        //Esto permite que visualicemos los elementos agregados al componente JLIST
        for (int i=0;i<miZoologico.getAnimales().getCapacidad();i++){
            if (miZoologico.getAnimales().buscar(i)!=null){
                modeloLista.addElement(miZoologico.getAnimales().buscar(i).toString());
            }
        }
        // Asignar el modelo a la JList
        this.jListAnimal.setModel(modeloLista);
        btnModificarAnimal.setEnabled(false);
        LimpiaTextAnimal();        
        
    }//GEN-LAST:event_btnAgregarAnimalActionPerformed

    private void txtFIdAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIdAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIdAnimalActionPerformed

    private void txtFEspecieAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEspecieAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFEspecieAnimalActionPerformed

    private void txtFNombreAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNombreAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNombreAnimalActionPerformed

    private void txtFEdadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEdadAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFEdadAnimalActionPerformed

    private void jComboHabitatAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboHabitatAnimalMouseClicked
        ActualizarComboxAnimalesHabitat();
    }//GEN-LAST:event_jComboHabitatAnimalMouseClicked

    private void jComboAlimentacionAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboAlimentacionAnimalMouseClicked
        // TODO add your handling code here:
        ActualizarComboxAnimalesAlimentacion();
    }//GEN-LAST:event_jComboAlimentacionAnimalMouseClicked

    private void jButtonMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMapaActionPerformed
        
        // TODO add your handling code here:
        Habitat[][] matrizHabitat = new Habitat[3][3]; // Matriz de 3 x 3 Habitats
        int fila = 0,columna=0;
        for (int i=0;i<miZoologico.getHabitats().getCapacidad();i++){ //Llena la matriz de Habitats
            if (miZoologico.getHabitats().buscar(i)!=null){
                matrizHabitat[fila][columna]=miZoologico.getHabitats().buscar(i);
                ++columna;
                if (columna==3) {
                    ++fila;
                    columna=0;
                }
            }
        }
        
        DefaultTableModel model = new DefaultTableModel(3, 3); // 3x3 matriz
        int id=0;
        // Rellenar la tabla con los objetos de la matriz
        for (fila = 0; fila < matrizHabitat.length; fila++) {
            for (columna = 0; columna < matrizHabitat[fila].length; columna++) {
                for (id=0;id<miZoologico.getAnimales().getCapacidad();id++){
                    
                    if (matrizHabitat[fila][columna]==null || miZoologico.getAnimales().buscar(id)==null){
                        continue;
                    }
                    
                    if (matrizHabitat[fila][columna].getId()==miZoologico.getAnimales().buscar(id).getHabitat().getId())
                        model.setValueAt("Habitat: "+matrizHabitat[fila][columna].getId()+" - Animal: "+miZoologico.getAnimales().buscar(id).getNombre(), fila, columna);
                        continue;
                    }
                }
            }
            jTableMapa.setModel(model);
    }//GEN-LAST:event_jButtonMapaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlimentacion;
    private javax.swing.JButton btnAgregarAnimal;
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JButton btnAgregarHabitat;
    private javax.swing.JButton btnAgregarVisitante;
    private javax.swing.JButton btnBuscarAlimentacion;
    private javax.swing.JButton btnBuscarAnimal;
    private javax.swing.JButton btnBuscarEvento;
    private javax.swing.JButton btnBuscarHabitat;
    private javax.swing.JButton btnBuscarVisitante;
    private javax.swing.JButton btnEliminarAlimentacion;
    private javax.swing.JButton btnEliminarAnimal;
    private javax.swing.JButton btnEliminarEvento;
    private javax.swing.JButton btnEliminarHabitat;
    private javax.swing.JButton btnEliminarVisitante;
    private javax.swing.JButton btnModificarAlimentacion;
    private javax.swing.JButton btnModificarAnimal;
    private javax.swing.JButton btnModificarEvento;
    private javax.swing.JButton btnModificarHabitat;
    private javax.swing.JButton btnModificarVisitante;
    private javax.swing.JButton btnVisualizarAlimentacion;
    private javax.swing.JButton btnVisualizarAnimal;
    private javax.swing.JButton btnVisualizarEvento;
    private javax.swing.JButton btnVisualizarHabitat;
    private javax.swing.JButton btnVisualizarVisitante;
    private javax.swing.JButton jButtonMapa;
    private javax.swing.JComboBox<Alimentacion> jComboAlimentacionAnimal;
    private javax.swing.JComboBox<Habitat> jComboHabitatAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListAlimentaciones;
    private javax.swing.JList<String> jListAnimal;
    private javax.swing.JList<String> jListEventos;
    private javax.swing.JList<String> jListHabitats;
    private javax.swing.JList<String> jListVisitantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jPanelRegistro;
    private javax.swing.JPanel jPanelRegistroAlimentacion;
    private javax.swing.JPanel jPanelRegistroAlimentacion1;
    private javax.swing.JPanel jPanelRegistroAlimentaciones;
    private javax.swing.JPanel jPanelRegistroEventos;
    private javax.swing.JPanel jPanelRegistroHabitats;
    private javax.swing.JPanel jPanelRegistroHabitats1;
    private javax.swing.JPanel jPanelRegistroHabitats2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableMapa;
    private java.awt.TextField txtFAlimentoAlimentacion;
    private java.awt.TextField txtFCantidadAlimentacion;
    private java.awt.TextField txtFCapacidadHabitat;
    private java.awt.TextField txtFCorreoVisitante;
    private java.awt.TextField txtFDescripcionEvento;
    private java.awt.TextField txtFEdadAnimal;
    private java.awt.TextField txtFEdadVisitante;
    private java.awt.TextField txtFEspecieAnimal;
    private java.awt.TextField txtFFechaEvento;
    private java.awt.TextField txtFFechaIngresoVisitante;
    private java.awt.TextField txtFFrecuenciaAlimentacion;
    private java.awt.TextField txtFHorarioAlimentacion;
    private java.awt.TextField txtFIdAlimentacion;
    private java.awt.TextField txtFIdAnimal;
    private java.awt.TextField txtFIdEvento;
    private java.awt.TextField txtFIdHabitat;
    private java.awt.TextField txtFIdVisitante;
    private java.awt.TextField txtFNombreAnimal;
    private java.awt.TextField txtFNombreEvento;
    private java.awt.TextField txtFNombreHabitat;
    private java.awt.TextField txtFNombreVisitante;
    private java.awt.TextField txtFTipoAmbienteHabitat;
    // End of variables declaration//GEN-END:variables
}
