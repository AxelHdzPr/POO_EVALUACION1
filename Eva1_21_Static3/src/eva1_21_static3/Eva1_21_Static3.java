/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_static3;

/**
 *
 * @author priet
 */
public class Eva1_21_Static3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Axelito.valor);
        Axelito.valor++;
        System.out.println(Axelito.valor);
        
        System.out.println("Ahora con objetos");
        PruebaObjetos obj = new PruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
        PruebaObjetos obj2 = new PruebaObjetos();
        System.out.println(obj2.valor);
    }
    
}
class Axelito{
public static int valor = 100;
}
class PruebaObjetos{
    public int valor = 100;
}