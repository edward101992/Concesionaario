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
public class Pruebas {
 
    
    public void menuAuto(){
            
        ArrayList listaAutos = new ArrayList(); 
        System.out.println("Elija La opcion:");
        System.out.println("****************");
        System.out.println("1. Ver Autos");
        System.out.println("2. Insertar Autos");
        System.out.println("3. Regresar al Menu de inicio");
        String opcion="";
        Scanner entScanner = new Scanner (System.in);
        opcion = entScanner.nextLine (); 
        int opc = Integer.parseInt(opcion);
        
        
        switch(opc){
            case 1:
                   ArrayList leerListaAuto = new ArrayList<>();
                   leerListaAuto = Inventario.leerArchivo();
                     for(Auto autotxt:(ArrayList<Auto>) leerListaAuto){
                         
                         System.out.println(autotxt.getCodigoCarro()+ " " + autotxt.getColorCarro()+ " " + autotxt.getMarcaCarro()+ " " + autotxt.getTipoCarro());
                    
                     }
                     break;
            case 2:
                     //Auto 1
                        Auto auto1 = new Auto();
                        auto1.setCodigoCarro("OPG-000");
                        auto1.setColorCarro("Negro");
                        auto1.setMarcaCarro("Mazda");
                        auto1.setTipoCarro("Deportivo");
                        listaAutos.add(auto1);
                        //Auto 2
                        Auto auto2 = new Auto();
                        auto2.setCodigoCarro("GGG-111");
                        auto2.setColorCarro("Rojo");
                        auto2.setMarcaCarro("Mazda");
                        auto2.setTipoCarro("Estandar");
                        listaAutos.add(auto2);
                        //Auto 3
                        Auto auto3 = new Auto();
                        auto3.setCodigoCarro("ZZZ-222");
                        auto3.setColorCarro("Verde");
                        auto3.setMarcaCarro("BMW");
                        auto3.setTipoCarro("Maquinaria");
                        listaAutos.add(auto3);

                        Inventario.crearArchivo(listaAutos);


                        Auto auto4 = new Auto();
                        auto4.setCodigoCarro("DDD-666");
                        auto4.setColorCarro("Cafe");
                        auto4.setMarcaCarro("Ferrary");
                        auto4.setTipoCarro("Maquinaria");
                        ArrayList nuevoAuto = new ArrayList();
                        nuevoAuto.add(auto4);

                        Inventario.aniadirArchivo(nuevoAuto);
            case 3:
                Inicio inicio = new Inicio();
                inicio.inicio();
            default:
                System.out.println("Opcion Invalida");
                
                }
   
        
    
 
    }
    
    
    
    
}
