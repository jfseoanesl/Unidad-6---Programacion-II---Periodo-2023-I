/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jairo F
 */
public class JDConsulta extends JDialog {
    
    private Container contenedor;
    
    private JLabel lbTipovehiculo;
    private JComboBox cmbTipo;
    
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private String[] titulos = {"Placa", "Precio Km", "Km Renta", "Km devolucion", 
                                "Precio Dia", "Fecha renta", "Fecha devolucion", "Estado"};
    private String[][] datosTabla = null;

    public JDConsulta(JFrame owner, String title, boolean modal) {
        super(owner, title, modal);
        this.initComponentes();
//        this.pack();
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    private void initComponentes(){
        
        this.contenedor = this.getContentPane();
        this.setLayout(new BorderLayout());
        this.panelBusqueda();
        this.panelResultados();
        
        
    
    }
    
    private void panelBusqueda(){
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        this.lbTipovehiculo = new JLabel("Tipo vheiculo: ");
        String[] listItem ={"Autobus","Tractor"};
        this.cmbTipo = new JComboBox(listItem);
        this.cmbTipo.addActionListener(new EventoClickComboTIpo());
        
        panel.add(this.lbTipovehiculo);
        panel.add(this.cmbTipo);
       
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.contenedor.add(panel, BorderLayout.NORTH);
        
    
    }
    
    
    private void panelResultados(){
        
        JScrollPane panel = new JScrollPane();
        
        this.tabla = new JTable();
        this.modeloTabla = new DefaultTableModel(this.datosTabla, this.titulos);
        this.tabla.setModel(this.modeloTabla);
        
        panel.setViewportView(this.tabla);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.contenedor.add(panel, BorderLayout.CENTER);
    
        
    }
    
    class EventoClickComboTIpo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            verOpcionSeleccionada();
            
        }
    
    }
    
    private void verOpcionSeleccionada(){
        
        String selected = this.cmbTipo.getSelectedItem().toString();
        switch(selected){
          //
          //
        }
        
        JOptionPane.showMessageDialog(null, "Opcion Seleccionada : " + selected);
    }
    
    
    
}
