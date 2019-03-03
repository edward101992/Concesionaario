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
 * @author SuperUs
 */
public class Inventario {

 
    public static void crearArchivo(ArrayList lista){
        FileWriter flwriter = null;
        try{
			flwriter = new FileWriter("D:\\EjemploArchivo\\Carros.txt");
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Auto autotxt: (ArrayList<Auto>)lista) {
				bfwriter.write(autotxt.getCodigoCarro()+ "," + autotxt.getColorCarro()+ "," + autotxt.getMarcaCarro() + "," + autotxt.getTipoCarro() + "\r\n");
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
            listaCarros.add(p);
        }
        scanner.close();
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }
    return listaCarros;
    }
   

    public static void aniadirArchivo(ArrayList lista) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("D:\\EjemploArchivo\\Carros.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Auto autotxt: (ArrayList<Auto>)lista) {
                            	bfwriter.write(autotxt.getCodigoCarro()+ "," + autotxt.getColorCarro()+ "," + autotxt.getMarcaCarro()+ "," + autotxt.getTipoCarro()+ "\r\n" );

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