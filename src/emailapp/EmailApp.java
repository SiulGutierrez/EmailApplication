/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author Siul Gutierrez
 * @version 0.1, 23 Dic 2018
 */
public class EmailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apPaterno;
        String apMaterno;
        System.out.println("*---------------- Datos Personales --------------------*");
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = datos.nextLine();
        System.out.print("Ingrese el apellido paterno: ");
        apPaterno = datos.nextLine();
        System.out.print("Ingrese el apellido materno: ");
        apMaterno = datos.nextLine();
       
        Email email = new Email(nombre, apPaterno, apMaterno);
        email.mostrarInformacion();
    }
    
}
