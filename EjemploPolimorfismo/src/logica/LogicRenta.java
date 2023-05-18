/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import modelo.Vehiculo;
import persistencia.IRenta;
import persistencia.ListaVehiculo;
import persistencia.MapaVehiculo;

/**
 *
 * @author Jairo F
 */
public class LogicRenta {
    
    private IRenta datos;

    public LogicRenta() {
       // this.datos = new ListaVehiculo();
        this.datos = new MapaVehiculo();
    }
    
    
    public void rentarVehiculo(Vehiculo v){
        this.datos.registraVehiculo(v);
    }
    
    public Vehiculo buscarRentado(String placa){
         return this.datos.buscarVehiculo(placa);
    }
    
    public List<Vehiculo> informeRentas(){
        
        return this.datos.informeRenta();
    }
    
}
