/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.Date;

/**
 *
 * @author Edward Ramos
 * @author Sesbastian Rincon
 * @version 1.0
 */
public class Factura {
    
        
    String cliente;
    String CodFactura;
    Date fecha;
    int total;
    

    public String getCliente() {
        return cliente;
    }

    public String getCodFactura() {
        return CodFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setCodFactura(String CodFactura) {
        this.CodFactura = CodFactura;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTotal(int total) {
        this.total = total;
    }

           
    
    
}
