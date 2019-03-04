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
public class Vendedor {
  
    String codigoVendedor;
    String nombreVendedor;
    int sueldoVendedor;
    float comisionVendedor;
    
    public Vendedor(String codigoVendedor, String nombreVendedor, int sueldoVendedor, float comisionVendedor) {
        this.codigoVendedor = codigoVendedor;
        this.nombreVendedor = nombreVendedor;
        this.sueldoVendedor = sueldoVendedor;
        this.comisionVendedor = comisionVendedor;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public int getSueldoVendedor() {
        return sueldoVendedor;
    }

    public float getComisionVendedor() {
        return comisionVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void setSueldoVendedor(int sueldoVendedor) {
        this.sueldoVendedor = sueldoVendedor;
    }

    public void setComisionVendedor(float comisionVendedor) {
        this.comisionVendedor = comisionVendedor;
    }
 
}
