/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.Pattern;


/**
 * @author Danim
 *
 */

public class Persona {
	//Atributos Privados de tipo String y Entero.
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    static final int mayoriaEdad = 18;
 
    public Persona() {
       // System.out.println("SE ESTÁ EJECUTANDO EL CONSTRUCTOR POR DEFECTO, PORQUE SI!!!!!!!");
    }
    
    /**
     * 
     * @param nombrePers hace referencia al atributo nombre
     * @param apellidosPers hace referencia al atributo  apellido
     * @param edadPers hace referencia al atributo edad
     */
    Persona(String nombrePers, String apellidosPers, int edadPers){
        this();
        this.nombre = nombrePers;
        this.apellidos = apellidosPers;
        this.edad = edadPers;
        this.dni = "NO TIENE";
        
    }
    
    
    /**
     * 
     * @param dni hace referencia al atributo dni
     * @param nombrePers hace referencia al atributo nombre
     * @param apellidosPers hace referencia al atributo apellido
     * @param edadPers hace referencia al atributo edad 
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this();
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    /**
     * 
     * @return devuelve valor del dni a la clase PruebaPersona
     */
    public String getDni() {
        return dni;
    }
    /**
     * 
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * 
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * 
     * @return
     */
    public int getEdad() {
        return this.edad; 
    }
    /**
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public void updateEdad() {
        this.edad = this.edad + 1;
        
    }

    // Devuelve si es menor o no
    public boolean esMenor() {
        return this.edad < Persona.mayoriaEdad;
    }
    
    
    // Devuelve si es jubilado o no
    public boolean esJubilado() {
        
        boolean jub = this.edad >= 65;
        return jub;
        //return this.edad >= 65;
    }

    //Devuelve la diferencia de edad entre este objeto y el recibido
    public int diferenciaEdad(Persona p) {
        return this.edad - p.edad;          //p2.edad - p3.edad  ////// p3.edad - p2.edad
    }

    public void imprime() {
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
    }

    @Override
    public String toString(){
        
           return "Persona{" + "nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", dni=" + this.dni + ", edad=" + this.edad + '}';
        
    }
    
    
    // Funcion que recibe un DNI y devuelve si es valido o no. OJO no comprueba que la letra sea correcta!
    public static boolean validarDNI(String valor) {
        // Expresion regular que indica 8 digitos y al final alguna de las letras que se permiten
        // rangos A-H J-N P-T V-Z (recordad, algunas no se permiten)
     
        
        
        
        
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        // Devuelve true si se cumple la expresion regular
        return Pattern.matches(dniRegexp, valor);
        
        
        
        
    }
}