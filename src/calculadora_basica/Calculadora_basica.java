/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_basica;

import calculadora.servicio.OperacionesImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jessi
 */
import calculadora.servicio.OperacionesImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculadora_basica {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       

	int p;
        OperacionesImpl op = new OperacionesImpl();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el núemro 1: ");
		int n1 = Integer.parseInt(br.readLine());

		System.out.println("Ingrese el núemro 2: ");
		int n2 = Integer.parseInt(br.readLine());
		
		System.out.println("Seleccione la operación a realizar:\n 1 suma \n 2 resta \n 3 multiplicación \n 4 división \n Precione cualquier otro número para salir...");
		int o = Integer.parseInt(br.readLine());
    }
    
}

