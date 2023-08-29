/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Entidades;

import Entidades_ordenamiento.OrdenamientoAsc;
import Entidades_ordenamiento.OrdenamientoDesc;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class frmLab1 extends javax.swing.JFrame {

    /**
     * Creates new form frmLab1
     */
    //creacion de arraylist album (padre) y creacion de modelos de tablas
    ArrayList<Album> lAlbum;
    DefaultTableModel modeloAlbum;
    DefaultTableModel modeloCancion;
    private final Color fondo_oscuro = new Color(30, 30, 30);
    private final Color texto_oscuro = Color.WHITE;
    private boolean modoOscuroActivo = false;

    public frmLab1() {
        initComponents();
        //inicializador de array y tablas
        lAlbum = new ArrayList<>();
        modeloAlbum = (DefaultTableModel) this.jTableAlbum.getModel();
        modeloCancion = (DefaultTableModel) this.jTableCancion.getModel();
        Album album1 = new Album("Utopia", "Travis Scott", "Hip Hop");
        Album album2 = new Album("Days Before Rodeo", "Travis Scott", "Hip Hop");
        lAlbum.add(album1);
        lAlbum.add(album2);
        Cancion cancion1 = new Cancion("Hyena", 3.55);
        Cancion cancion2 = new Cancion("Skyfall", 3.25);
        album1.getlCancion().add(cancion1);
        album2.getlCancion().add(cancion2);
        actualizarTabla();
        modeloCancion.getDataVector().removeAllElements();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreAlbum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtArtista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        txtNombreCancion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlbum = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCancion = new javax.swing.JTable();
        bttnAgregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bttnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCalcular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bttnCalcular = new javax.swing.JButton();
        txtShowMinutos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bttnAsc = new javax.swing.JButton();
        bttnDesc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bttnExCSV = new javax.swing.JButton();
        bttnInCSV = new javax.swing.JButton();
        bttnHMTL = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        bttnModoOscuro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.black);

        jLabel1.setText("Agregar Álbum:");

        jLabel2.setText("Nombre del Álbum:");

        jLabel3.setText("Artista:");

        jLabel4.setText("Género:");

        jLabel5.setText("Agregar Canción:");

        jLabel6.setText("Nombre la Canción:");

        jLabel7.setText("Duración:");

        jTableAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del Álbum", "Artista", "Género:"
            }
        ));
        jTableAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlbumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlbum);

        jTableCancion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre de la Canción:", "Duración:"
            }
        ));
        jTableCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCancionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCancion);

        bttnAgregar.setText("Agregar");
        bttnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAgregarActionPerformed(evt);
            }
        });

        jLabel8.setText("Buscar Álbum:");

        bttnBuscar.setText("Buscar");
        bttnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setText("Calcular duración total:");

        jLabel10.setText("Ingrese nombre del Álbum:");

        jLabel11.setText("Duración:");

        jLabel12.setText("minutos");

        bttnCalcular.setText("Calcular");
        bttnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCalcularActionPerformed(evt);
            }
        });

        txtShowMinutos.setEditable(false);

        jLabel13.setText("Ordenar Álbum:");

        bttnAsc.setText("Ascendente");
        bttnAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAscActionPerformed(evt);
            }
        });

        bttnDesc.setText("Descendente");
        bttnDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDescActionPerformed(evt);
            }
        });

        bttnExCSV.setText("Exportar CSV");
        bttnExCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExCSVActionPerformed(evt);
            }
        });

        bttnInCSV.setText("Importar CSV");
        bttnInCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnInCSVActionPerformed(evt);
            }
        });

        bttnHMTL.setText("Exportar HTML");
        bttnHMTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnHMTLActionPerformed(evt);
            }
        });

        jLabel14.setText("Manejo de Archivos:");

        bttnModoOscuro.setBackground(new java.awt.Color(30, 30, 30));
        bttnModoOscuro.setForeground(new java.awt.Color(255, 255, 255));
        bttnModoOscuro.setText("Modo Oscuro");
        bttnModoOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnModoOscuroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttnModoOscuro))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bttnCalcular))
                                .addComponent(jLabel9)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtShowMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(bttnAgregar)
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bttnAsc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bttnDesc, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bttnBuscar)))
                            .addComponent(jLabel13))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnHMTL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(bttnExCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttnInCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(9, 9, 9)
                                .addComponent(bttnAsc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttnDesc))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bttnExCSV, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnInCSV, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttnHMTL, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bttnBuscar)))
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(bttnAgregar)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtShowMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnModoOscuro))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //metodo de accion
    private void bttnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAgregarActionPerformed
        //recibe el input del album
        String NombreAlbum = txtNombreAlbum.getText().trim();
        String ArtistaAlbum = txtArtista.getText().trim();
        String GeneroAlbum = txtGenero.getText().trim();
        
        //busca si hay algun album existente con metodo declarado
        int indiceAlbumExistente = BuscarAlbumExistente(NombreAlbum, ArtistaAlbum, GeneroAlbum);
        String NombreCancion = txtNombreCancion.getText().trim();
        double DuracionCancion;
        try{
            DuracionCancion = Double.parseDouble(txtDuracion.getText().trim());
        }
        catch(Exception ee){JOptionPane.showMessageDialog(this, "La duración debe ser un número válido");
            return;
        }
        if (indiceAlbumExistente !=  -1) {
            Cancion cancion = new Cancion(NombreCancion, DuracionCancion);
            lAlbum.get(indiceAlbumExistente).getlCancion().add(cancion);
        } else {
            Album NuevoAlbum = new Album(NombreAlbum, ArtistaAlbum, GeneroAlbum);
            Cancion cancion = new Cancion(NombreCancion, DuracionCancion);
            NuevoAlbum.getlCancion().add(cancion);
            lAlbum.add(NuevoAlbum);
        }
        limpiarCampos();
        actualizarTabla();
    }//GEN-LAST:event_bttnAgregarActionPerformed
    //metodo de accion
    private void jTableAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlbumMouseClicked
        int indiceAlbum = this.jTableAlbum.getSelectedRow();
        int cantCanciones = this.lAlbum.get(indiceAlbum).getlCancion().size();
        modeloCancion.getDataVector().removeAllElements();
        Album AlbumSeleccionado = this.lAlbum.get(indiceAlbum);
        this.txtNombreAlbum.setText(AlbumSeleccionado.getNombreAlbum());
        this.txtArtista.setText(AlbumSeleccionado.getArtistaAlbum());
        this.txtGenero.setText(AlbumSeleccionado.getGeneroAlbum());
        for (int indiceCancion = 0; indiceCancion < cantCanciones; indiceCancion++) {
            String[] registroCanciones = {this.lAlbum.get(indiceAlbum).getlCancion().get(indiceCancion).getNombreCancion(),
                Double.toString(this.lAlbum.get(indiceAlbum).getlCancion().get(indiceCancion).getDuracionCancion())};
            modeloCancion.addRow(registroCanciones);
        }
    }//GEN-LAST:event_jTableAlbumMouseClicked

    private void jTableCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCancionMouseClicked
        
    }//GEN-LAST:event_jTableCancionMouseClicked
    //metodo de accion
    private void bttnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBuscarActionPerformed
        this.modeloAlbum.setRowCount(0);
        this.modeloCancion.setRowCount(0);

        String buscarAlbum = this.txtBuscar.getText().trim();
        boolean encontrado = false;

        for (Album album : lAlbum) {
            if (album.getNombreAlbum().equals(buscarAlbum)) {
                String[] registro = {album.getNombreAlbum(), album.getArtistaAlbum(), album.getGeneroAlbum()};
                this.modeloAlbum.addRow(registro);
                encontrado = true;
                // Almacenar las canciones del álbum en una lista temporal
                ArrayList<Cancion> cancionesDelAlbum = album.getlCancion();
                // Agregar cada canción a la tabla de canciones
                for (Cancion cancion : cancionesDelAlbum) {
                    String[] registroCancion = {cancion.getNombreCancion(), String.valueOf(cancion.getDuracionCancion())};
                    this.modeloCancion.addRow(registroCancion);
                }
                break; // Encuentra el álbum, sale del bucle
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Álbum no encontrado");
        }
    }//GEN-LAST:event_bttnBuscarActionPerformed
    //metodo de accion y llamada a metodo predefinido
    private void bttnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCalcularActionPerformed
        double totalDuracion  = TotalizarDuracion(this.txtCalcular.getText().trim());
        this.txtShowMinutos.setText(Double.toString(totalDuracion));
    }//GEN-LAST:event_bttnCalcularActionPerformed
    //metodo de accion ordenar asc
    private void bttnAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAscActionPerformed
        OrdenamientoAsc oAsc = new OrdenamientoAsc();
        this.lAlbum.sort(oAsc);
        this.actualizarTabla();
    }//GEN-LAST:event_bttnAscActionPerformed
    //metodo de accion ordenar desc
    private void bttnDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDescActionPerformed
        OrdenamientoDesc oDesc = new OrdenamientoDesc();
        this.lAlbum.sort(oDesc);
        this.actualizarTabla();
    }//GEN-LAST:event_bttnDescActionPerformed

    private void bttnExCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExCSVActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showSaveDialog(this); // Cambiado a showSaveDialog para seleccionar la ubicación del archivo
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());

            try (PrintWriter pw = new PrintWriter(selectedFile)) {
                pw.println("Album, Artista, Género, Canción, Duración"); // Encabezados

                for (Album AlbTemp : lAlbum) {
                    for (Cancion cancion : AlbTemp.getlCancion()) {
                        pw.println(AlbTemp.getNombreAlbum() + ","
                                + AlbTemp.getArtistaAlbum() + ","
                                + AlbTemp.getGeneroAlbum() + ","
                                + cancion.getNombreCancion() + ","
                                + cancion.getDuracionCancion());
                    }
                }
                pw.checkError();
                JOptionPane.showMessageDialog(this, "Archivo exportado correctamente!");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ups, error en exportar archivo!");
            }
        }
    }//GEN-LAST:event_bttnExCSVActionPerformed

    private void bttnInCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnInCSVActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
            importarCSV(selectedFile.getAbsolutePath());
        }
        actualizarTabla();
        JOptionPane.showMessageDialog(this, "Archivo importado correctamente!");
    }//GEN-LAST:event_bttnInCSVActionPerformed

    private void bttnHMTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnHMTLActionPerformed
        PrintWriter pw = null;
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showSaveDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                pw = new PrintWriter(selectedFile); // Use the selected file

                StringBuilder StrLinea = new StringBuilder();
                StrLinea.append("<html><body><table border='2'>" + "\n");
                StrLinea.append("<tr><td><b>Álbum</td><td><b>Artista</td><td><b>Género</td><td><b>Canción</td><td><b>Duración</td></tr>" + "\n");

                for (Album AlbTemp : lAlbum) {
                    for (Cancion cancion : AlbTemp.getlCancion()) {
                        StrLinea.append("<tr>" + "\n");
                        StrLinea.append(String.format("<td>%s</td>%n", AlbTemp.getNombreAlbum()));
                        StrLinea.append(String.format("<td>%s</td>%n", AlbTemp.getArtistaAlbum()));
                        StrLinea.append(String.format("<td>%s</td>%n", AlbTemp.getGeneroAlbum()));
                        StrLinea.append(String.format("<td>%s</td>%n", cancion.getNombreCancion()));
                        StrLinea.append(String.format("<td>%s</td>%n", cancion.getDuracionCancion()));
                        StrLinea.append("</tr>" + "\n");
                    }
                }

                StrLinea.append("</table></body></html>" + "\n");
                pw.append(StrLinea.toString());
                JOptionPane.showMessageDialog(this, "Archivo HTML exportado correctamente!");
            } else {
                // User canceled the file selection
                JOptionPane.showMessageDialog(this, "Operación cancelada por el usuario");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ups, error en exportar archivo!");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }//GEN-LAST:event_bttnHMTLActionPerformed

    private void bttnModoOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnModoOscuroActionPerformed
        if (!modoOscuroActivo) {
            activarModoOscuro();
        } else {
            desactivarModoOscuro();
        }
    }//GEN-LAST:event_bttnModoOscuroActionPerformed
    //metodo de apoyo
    private void actualizarTabla() {
        modeloCancion.setRowCount(0); // Limpiar la tabla de canciones
        modeloAlbum.setRowCount(0); // Limpiar la tabla de álbumes
        for (Album album : lAlbum) {
            for (Cancion cancion : album.getlCancion()) {
                modeloCancion.addRow(new Object[]{cancion.getNombreCancion(), cancion.getDuracionCancion(), album.getNombreAlbum()});
            }
            modeloAlbum.addRow(new Object[]{album.getNombreAlbum(), album.getArtistaAlbum(), album.getGeneroAlbum()});
        }
        this.limpiarCampos();
    }
    //metodo de apoyo
    private int BuscarAlbumExistente(String NombreAlbum, String ArtistaAlbum, String GeneroAlbum){
        for (int i = 0; i < lAlbum.size(); i++) {
            Album album = lAlbum.get(i);
            if (album.getNombreAlbum().equals(NombreAlbum)
                    && album.getArtistaAlbum().equals(ArtistaAlbum)
                    && album.getGeneroAlbum().equals(GeneroAlbum)) {
                return i;
            }
        }
        return -1;
    }
    //metodo de apoyo
    private void limpiarCampos() {
        txtNombreAlbum.setText("");
        txtArtista.setText("");
        txtGenero.setText("");
        txtNombreCancion.setText("");
        txtDuracion.setText("");
    }
    //metodo de apoyo
    private double TotalizarDuracion(String NombreAlbum){
        double totalDuracion = 0.0;
        for(Album album : lAlbum){
            if(album.getNombreAlbum().equals(NombreAlbum)){
                for(Cancion cancion : album.getlCancion()){
                    totalDuracion += cancion.getDuracionCancion();
                }
                break;
            }
        }
        return totalDuracion;
    }
    private void importarCSV(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            String[] header = scanner.nextLine().split(",");
            List<Album> albums = new ArrayList<>();
            Album currentAlbum = null;

            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split(",");
                String albumName = values[0];
                String artist = values[1];
                String genre = values[2];
                String songName = values[3];
                double duration = Double.parseDouble(values[4]);

                if (currentAlbum == null || !currentAlbum.getNombreAlbum().equals(albumName)) {
                    currentAlbum = new Album(albumName, artist, genre);
                    albums.add(currentAlbum);
                }

                Cancion song = new Cancion(songName, duration);
                currentAlbum.getlCancion().add(song);
            }

            lAlbum.addAll(albums);
            actualizarTabla();

            System.out.println("Importación completada.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error en importar archivo!");
        }
    }
    //modo oscuro
    private void activarModoOscuro(){
        this.getContentPane().setBackground(fondo_oscuro);
        this.bttnModoOscuro.setBackground(fondo_oscuro);
        this.bttnModoOscuro.setForeground(texto_oscuro);
        
        applyDarkModeToComponent(this.getContentPane());
        modoOscuroActivo = true;
    }
    private void desactivarModoOscuro(){
        this.getContentPane().setBackground(null);
        this.bttnModoOscuro.setBackground(null);
        this.bttnModoOscuro.setForeground(null);
        
        restoreDefaultColors(this.getContentPane());
        modoOscuroActivo = false;
    }
    private void applyDarkModeToComponent(Component comp){
        comp.setBackground(fondo_oscuro);
        comp.setForeground(texto_oscuro);

        if (comp instanceof Container) {
            for (Component child : ((Container) comp).getComponents()) {
                applyDarkModeToComponent(child);
            }
        }
    }
    private void restoreDefaultColors(Component comp) {
        comp.setBackground(null);
        comp.setForeground(null);

        if (comp instanceof Container) {
            for (Component child : ((Container) comp).getComponents()) {
                restoreDefaultColors(child);
            }
        }
}


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
            java.util.logging.Logger.getLogger(frmLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLab1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAgregar;
    private javax.swing.JButton bttnAsc;
    private javax.swing.JButton bttnBuscar;
    private javax.swing.JButton bttnCalcular;
    private javax.swing.JButton bttnDesc;
    private javax.swing.JButton bttnExCSV;
    private javax.swing.JButton bttnHMTL;
    private javax.swing.JButton bttnInCSV;
    private javax.swing.JButton bttnModoOscuro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAlbum;
    private javax.swing.JTable jTableCancion;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCalcular;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombreAlbum;
    private javax.swing.JTextField txtNombreCancion;
    private javax.swing.JTextField txtShowMinutos;
    // End of variables declaration//GEN-END:variables
}
