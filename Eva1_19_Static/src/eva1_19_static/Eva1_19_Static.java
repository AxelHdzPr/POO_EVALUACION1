/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static;

/**
 *
 * @author priet
 */
public class Eva1_19_Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pi" + Math.PI);
        System.out.println("numero aleatoio: "+ Math.random());
        Utilerias utileria = new Utilerias();
        utileria.saludo();
        utileria.otroSaludo();
        Saludo2();/*SI no es estatico, y no se ha creado un objeto el metodo
                  no existe*/
    }
    public void Saludo2(){
        System.out.println("Hola");
    }
}
class Utilerias{
 public void saludo(){
     System.out.println("Hola");
 }
 public static void otroSaludo(){
        System.out.println("otro saludo");
}
 
class Otraclase{
   
    }
}