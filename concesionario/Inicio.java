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
 * @author SuperUs
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public void inicio(){
       Pruebas pruebaC = new Pruebas();
        System.out.println("Elija la Opcion: ");
        System.out.println("*****************");
        System.out.println("1.  Autos ");
        System.out.println("2.  Clientes ");
        System.out.println("3.  Vendedores ");
        System.out.println("4.  Factura ");       
        String opcion="";
        Scanner entScanner = new Scanner (System.in);
        opcion = entScanner.nextLine (); 
        int opc = Integer.parseInt(opcion);
        switch(opc){
            case 1:
                Pruebas pru = new Pruebas();
                pru.menuAuto();
                break;
            default:
                System.out.println("Opcion Invalida");
                        
        }
    }
    public static void main(String[] args) {
       
    Inicio i = new Inicio();
    i.inicio();
       
    }
    
}
