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
 * @version 1.0
 */
public class Pruebas {
 
    /**
     * Clase en la cual se realizan las pruebas de insercion modificacion y lectura de los autos
     * 
     */
    public void menuAuto(){
            
       
        ArrayList listaAutos = new ArrayList();
       int opc2=0;
        
        
         
        do{
         System.out.println("Elija La opcion:");
        System.out.println("****************");
        System.out.println("1. Ver Autos");
        System.out.println("2. Insertar Autos");
        System.out.println("3. Regresar al Menu de inicio");
        System.out.println("4. Salir");
        String opcion="";
        Scanner entScanner = new Scanner (System.in);
        opcion = entScanner.nextLine (); 
        int opc = Integer.parseInt(opcion);
           switch(opc){
            case 1:
                   ArrayList leerListaAuto = new ArrayList<>();
                   leerListaAuto = Inventario.leerArchivo();
                     for(Auto autotxt:(ArrayList<Auto>) leerListaAuto){
                         
                         System.out.println("Codigo : " + autotxt.getCodigoCarro()+ "  Color : " + autotxt.getColorCarro()+ "  Marca : " + autotxt.getMarcaCarro()+ "  Cantidad : " + autotxt.getCantidadCarro()+ "  Tipo Carro: " + autotxt.getTipoCarro()+ "  Precio Unitario: " + autotxt.getPrecioUnidad());
                    
                     }
                     break;
            case 2:
                     //Autos 1
                        Auto auto1 = new Auto();
                        auto1.setCodigoCarro("00001");
                        auto1.setColorCarro("Negro");
                        auto1.setMarcaCarro("Mazda");
                        auto1.setTipoCarro("Deportivo");
                        auto1.setCantidadCarro("5");
                        auto1.setPrecioUnidad("20000000");
                        listaAutos.add(auto1);
                        //Autos 2
                        Auto auto2 = new Auto();
                        auto2.setCodigoCarro("00002");
                        auto2.setColorCarro("Rojo");
                        auto2.setMarcaCarro("Mazda");
                        auto2.setTipoCarro("Estandar");
                        auto2.setCantidadCarro("3");
                        auto2.setPrecioUnidad("30000000");
                        listaAutos.add(auto2);
                        //Autos 3
                        Auto auto3 = new Auto();
                        auto3.setCodigoCarro("00003");
                        auto3.setColorCarro("Verde");
                        auto3.setMarcaCarro("BMW");
                        auto3.setTipoCarro("Maquinaria");
                        auto3.setCantidadCarro("10");
                        auto3.setPrecioUnidad("40000000");
                        listaAutos.add(auto3);

                        Inventario.crearArchivo(listaAutos);


                        Auto auto4 = new Auto();
                        auto4.setCodigoCarro("00004");
                        auto4.setColorCarro("Cafe");
                        auto4.setMarcaCarro("BMW");
                        auto4.setTipoCarro("Maquinaria");
                        auto4.setCantidadCarro("2");
                        auto4.setPrecioUnidad("55000000");
                        ArrayList nuevoAuto = new ArrayList();
                        nuevoAuto.add(auto4);

                        
                        
                        Inventario.aniadirArchivo(nuevoAuto);
            case 3:
                Inicio inicio = new Inicio();
                inicio.inicio();           
                }
       
        System.out.println("1. Volver al menu");
        System.out.println("9. Salir de la Aplicacion");
        String opcion2="";
        Scanner entScanner2 = new Scanner (System.in);
        opcion2 = entScanner2.nextLine (); 
        opc2 = Integer.parseInt(opcion2);
       }
       while(opc2 != 9);
        
    }
    
    
    
    
}
