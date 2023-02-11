/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases;

/**
 *
 * @author invitado
 */
public class Persona {
    String nombre;
    String Apellido;
    int edad;
    boolean estadoCivil;
    //metodos: comportamiento
    //lectura y escritura de atributos
    //metodos get --> leer, metodo set --> escribir
    //metodos:
    //modificador, valor de retorno, nombre, argumentos, implementacion
    public String getNombre(){
        return nombre;
    } 
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String valor){
        Apellido = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(boolean valor){
        estadoCivil = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos almacenados:");
        System.out.println("nombre completo:" + nombre + ""+ Apellido);
        System.out.println("edad:" + edad);
        if(estadoCivil = true)
             System.out.println("Estado Civil: casado");
        else
             System.out.println("Estado Civil: Soltero");   
        
    }
}
