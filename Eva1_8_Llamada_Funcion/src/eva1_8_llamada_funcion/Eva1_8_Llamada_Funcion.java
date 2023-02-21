/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_llamada_funcion;

/**
 *
 * @author priet
 */
public class Eva1_8_Llamada_Funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicia main()");
        A();
        System.out.println("Finaliza main()");
    }
    public static void A(){
        System.out.println("Inicia A()");
        B();//llamada a funcion
        System.out.println("Finaliza A()");
}
    public static void B(){
        System.out.println("Inicia B()");
        System.out.println("Finaliza B()");
}
}
//public static void C(){
        //System.out.println("Inicia C()");
        //System.out.println("Finaliza C()");
//