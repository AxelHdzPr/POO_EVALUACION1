/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_parametros;

/**
 *
 * @author priet
 */
public class Eva1_10_Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintln ("hola",5); 
    }
    public static void nPrintln(String message, int n){
        for (int i = 0; i < n; i++){
        System.out.println(message);
    }
}
}