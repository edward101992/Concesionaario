/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Edward Ramos
 * @author Sebastian Rincon
 * @versio 1.0
 */
public class Cliente {

    /**
     * Constructor.
     * @param codigoCliente Identificacion del cliente
     * @param nombreCliente Nombre del cliente
     */
    String codigoCliente;
    String nombreCliente;
    
    
    
    public void comprarAuto(){
        /**
         * Medoto en el cual el cliente ve el carro q desea comprar
         */
        
        Inventario inv = new Inventario();
        Scanner teclado = new Scanner( System.in );       
         ArrayList leerListaAuto = new ArrayList<>();
                   leerListaAuto = Inventario.leerArchivo();
                     for(Auto autotxt:(ArrayList<Auto>) leerListaAuto){
                         
                         System.out.println("Codigo : " + autotxt.getCodigoCarro()+ "  Color : " + autotxt.getColorCarro()+ "  Marca : " + autotxt.getMarcaCarro()+ "  Cantidad : " + autotxt.getCantidadCarro()+ "  Tipo Carro: " + autotxt.getTipoCarro()+ "  Precio Unitario: " + autotxt.getPrecioUnidad());                 

        }

                         
    }
    
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
 
        public Cliente(){
        
    }
    

}
