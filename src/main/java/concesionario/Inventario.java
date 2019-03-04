/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Edward Ramos
 * @autor Sebstian Rincon
 * @version 1.0
 * Clase en la cual se crea y se guardan los datos del Auto en una ArrayList
 */
public class Inventario {

 /**
  * 
  * Metodo que crea el archi de texto para guardar 
  * la lista
  * @param lista 
  */
    public static void crearArchivo(ArrayList lista){
        FileWriter flwriter = null;
        try{
			flwriter = new FileWriter("D:\\EjemploArchivo\\Carros.txt");
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Auto autotxt: (ArrayList<Auto>)lista) {
				bfwriter.write(autotxt.getCodigoCarro()+ "," + autotxt.getColorCarro()+ "," + autotxt.getMarcaCarro() + "," + autotxt.getTipoCarro()+ "," + autotxt.getCantidadCarro()+ "," + autotxt.getPrecioUnidad() + "\r\n");
			}
                        bfwriter.close();
                        System.out.println("Archivo creado");
                
            
        }catch(IOException e){
        e.printStackTrace();
        }finally{
            if(flwriter != null){
                try{
                    flwriter.close();
                }catch(IOException e){
                    e.printStackTrace();
                    
                }
            }
        }
    }
     /**
      * 
      * Metodo que lee los datos guardado en el archivo .txt
      * 
      */
 public static ArrayList leerArchivo(){
    File file = new File("D:\\EjemploArchivo\\Carros.txt");
    ArrayList listaCarros = new ArrayList<>();
    Scanner scanner;
    try{
        scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String linea = scanner.nextLine();
            Scanner delimitar = new Scanner(linea);
            delimitar.useDelimiter("\\s*,\\s*");
            Auto p = new Auto();
            p.setCodigoCarro(delimitar.next());
            p.setColorCarro(delimitar.next());
            p.setMarcaCarro(delimitar.next());
            p.setTipoCarro(delimitar.next());
            p.setCantidadCarro(delimitar.next());
            p.setPrecioUnidad(delimitar.next());
            listaCarros.add(p);
        }
        scanner.close();
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }
    return listaCarros;
    }
   /**
    * 
    * Metodo que añade un nuevo auto a la lista 
    * y lo almacena en el archivo .txt
    * 
    * @param lista 
    */

    public static void aniadirArchivo(ArrayList lista) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("D:\\EjemploArchivo\\Carros.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Auto autotxt: (ArrayList<Auto>)lista) {
				bfwriter.write(autotxt.getCodigoCarro()+ "," + autotxt.getColorCarro()+ "," + autotxt.getMarcaCarro() + "," + autotxt.getTipoCarro()+ "," + autotxt.getCantidadCarro()+ "," + autotxt.getPrecioUnidad() + "\r\n");

			}
			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}