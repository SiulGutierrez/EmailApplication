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
 */
public class Email {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String pass;
    private int defaultPassTamanio = 10;
    private String departamento;
    private String email;
    private int capacidadBuzon;
    private String emailAlterno;

    //Constructor con los atributos de la clase e implementación de métodos para
    //generar correo, contraseña
    public Email(String nombre, String apPaterno, String apMaterno) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        
        //Llamar al metodo que pregunta por el departamento
        this.departamento = setDepartamento();
        
        //Llamar al metodo que genera una contraseña aleatoria
        this.pass = randomPass(defaultPassTamanio);
        
        //Generar un correo electrónico
        email = nombre.toLowerCase().split(" ")[0].toString()+ "." + apPaterno.toLowerCase() + "_" + departamento.toLowerCase() + "@"  + "carbo.com";
        
    }
    
    /**
     * Método para establecer que departamento fue asignado el correo electrónico
     * @param int Recibe por parametro el código correspondiente al departamento
     * @return String Retorna el departamento correspondiente al código recibido
     */
    private String setDepartamento(){
        System.out.print("*---------------- Asignar departamento --------------------*");
        System.out.print("\n1 Direccion General, \n2 Recursos Humanos, \n3 Produccion \n4 Finanzas \n5 Mercadotecnia \n6 Informatica \n0 Ninguno \n Ingrese el número del departamento: ");
        Scanner in = new Scanner(System.in);
        int elegir = in.nextInt();
        switch (elegir) {
            case 1:
                return "DirecionGral";
            case 2:
                return "RRHH";
            case 3:
                return "Produccion";
            case 4:
                return "Finanzas";
            case 5:
                return "Mercadotecnia";  
            case 6:
                return "Informatica";    
            default:
                return "";
        }
    }
    
    /**
     * Método para generar una contraseña en base a una cadena predefinida
     * @param tamanio Recibe como parametro una cantidad de caracteres
     * @return String Retorna una contraseña generada
     */
    private String randomPass(int tamanio){
        String pass = "ABCDEFGHIJKLMNÑOPQRSTVWXYZ-abcdefghijklmnñopqrstvwxyz-0123456789¡*!@#$%";
        char[] password = new char[tamanio];
        for (int i = 0; i < tamanio; i++){
            int rand = (int) (Math.random() * pass.length());
            password[i] = pass.charAt(rand);
        }
        return new String(password);
    }
    
    /**
     * Método para establecer el espacio en el correo electrónico
     * @param capacidad Recibe por parametro estatico la cantidad de espacio en el correo
     * @return 
     */
    public void setCapacidadEmail(int capacidad){
        this.capacidadBuzon = capacidad;
    }
    
    //Correo alterno
    public void setEmailAlterno(String correoAlterno){
        this.emailAlterno = correoAlterno;
    }
    
    //Cambiar contraseña
    public void cambiarPass(String passNuevo){
        this.pass = passNuevo;
    }
    
    public int getCapacidadEmail(){
        return capacidadBuzon;
    }
    
    public String getEmailAlterno(){
        return emailAlterno;
    }
    
    public String getPass(){
       return pass; 
    }
    
    /**
     * Método que muestra toda la información
     */
    public void mostrarInformacion(){
        System.out.println("*---------------- Información Detallada --------------------*");
        System.out.println("Nombre completo: " + this.nombre + " " + this.apPaterno + " " + this.apMaterno);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Correo Electrónico: " + this.email);
        System.out.println("Contraseña: " + this.pass);
    }
}
