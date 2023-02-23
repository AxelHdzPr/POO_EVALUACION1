/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_alcance2;

/**
 *
 * @author priet
 */
public class Eva1_14_Alcance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;//visible dentro del todo bloque main
        for (int i = 0; i < 10; i++) {
            int x = 100;//la variable esta declarada en main
                        //visible dentro de for
            int y = 100;// visible dento del for 
            if (i == 5){
                
            }
        }
        int y = 100;// aqui la variable y del ciclo for no exist 
                    // podemos declarar una variable del mismo nombre
    }
    
}
