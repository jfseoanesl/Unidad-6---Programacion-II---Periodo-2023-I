/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jairo F
 */
public class JDRegistro extends JDialog{
    
    private Container contenedor;
    
    private JLabel lbPlaca, lbTipo, lbPrecioKm, lbKmRenta, lbKmDev;
    private JLabel lbPrecioDia, lbFechaRenta, lbFechaDev;
    
    private JButton btnguardar, btnCancelar;
    
    private JTextField txtPlaca, txtPrecioKm, txtkmRenta, txtKmDev;
    private JFormattedTextField txtPrecioDia, txtFechaRenta, txtFechaDev;
    
    private JComboBox cmbTipo;

    public JDRegistro(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        this.initComponentes();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void initComponentes(){
        
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.crearPanelDatos();
        this.panelBotones();
    
    }
    
    public void panelBotones(){
    
        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2,1,5,5));
        
        this.btnguardar= new JButton("   Guardar   ");
        this.btnCancelar= new JButton("  Cancelar  ");
        
        panelGrid.add(this.btnguardar);
        panelGrid.add(this.btnCancelar);
        
        JPanel panel = new JPanel();
        panel.add(panelGrid);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        this.contenedor.add(panel, BorderLayout.EAST);
        
    }
    
    public void crearPanelDatos(){
        
        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(8,2,5,5));
        
        this.lbPlaca = new JLabel("Placa: ");
        this.lbTipo = new JLabel("Tipo vehiculo: ");
        this.lbPrecioKm = new JLabel("Precio Km: ");
        this.lbKmRenta = new JLabel("Km renta: ");
        this.lbKmDev=new JLabel("Km Devolucion: ");
        this.lbPrecioDia = new JLabel("Precio Dia: ");
        this.lbFechaRenta = new JLabel("Fecha renta: ");
        this.lbFechaDev = new JLabel("fecha devolucion: ");
        
        this.txtPlaca = new JTextField(20);
        
        this.txtPrecioKm = new JTextField();
        this.txtkmRenta = new JTextField();
        this.txtKmDev = new JTextField();;
        
        NumberFormat formato = NumberFormat.getCurrencyInstance();
        this.txtPrecioDia = new JFormattedTextField(formato);
        this.txtPrecioDia.setValue(0);
        this.txtFechaRenta = new JFormattedTextField();
        this.txtFechaRenta.setValue(new Date());
        this.txtFechaDev= new JFormattedTextField();
        this.txtFechaDev.setValue(new Date());
        
        this.cmbTipo = new JComboBox();
        this.cmbTipo.addItem("Autobus");
        this.cmbTipo.addItem("Tractor");
        
        panelGrid.add(this.lbPlaca);
        panelGrid.add(this.txtPlaca);
        
        panelGrid.add(this.lbTipo);
        panelGrid.add(this.cmbTipo);
        
        panelGrid.add(this.lbPrecioKm);
        panelGrid.add(this.txtPrecioKm);
        
        panelGrid.add(this.lbKmRenta);
        panelGrid.add(this.txtkmRenta);
        
        panelGrid.add(this.lbKmDev);
        panelGrid.add(this.txtKmDev);
        
        panelGrid.add(this.lbPrecioDia);
        panelGrid.add(this.txtPrecioDia);
        
        panelGrid.add(this.lbFechaRenta);
        panelGrid.add(this.txtFechaRenta);
        
        panelGrid.add(this.lbFechaDev);
        panelGrid.add(this.txtFechaDev);
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(panelGrid);
        this.contenedor.add(panel, BorderLayout.CENTER);
    
    }
    
}
