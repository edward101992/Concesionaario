/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Edward Ramos
 * @author Sebastian Rincon
 * @version 1.0
 */

public class Auto {         //Clase principal donde se realiza todo el manejo de la informacion relacionada con el auto

    /**
     * Constructor.
     * @param codigoCarro Codigo de asignacion para cada Auto
     * @param colorCarro  Color de los autos
     * @param marcaCarro  Marca de los autos
     * @param tipoCarro Maquinaria- deportivo- Personalizado- Estandar
     * @param cantidadCarro Valor de cuantos Autos hay de esas especificaciones
     * 
     */
        
    String codigoCarro;
    String colorCarro;
    String marcaCarro;
    String tipoCarro;
    String cantidadCarro;

    public void setPrecioUnidad(String precioUnidad) {
        this.precioUnidad = precioUnidad;
      
    }
    String precioUnidad;
    
    
    public String getCodigoCarro() {
        return codigoCarro;
    }
    
     public String getPrecioUnidad() {
        return precioUnidad;
    }

    public String getColorCarro() {
        return colorCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }
    
     public String getCantidadCarro() {
        return cantidadCarro;
    }

    public void setCodigoCarro(String codigoCarro) {
        this.codigoCarro = codigoCarro;
    }

    public void setColorCarro(String colorCarro) {
        this.colorCarro = colorCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    
    public void setCantidadCarro(String cantidadCarro) {
        this.cantidadCarro = cantidadCarro;
    }


    public Auto(){
        
    }
    
}
