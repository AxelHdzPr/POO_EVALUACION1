/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author priet
 */
public class Eva1_5_Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //area, perimetro, radio
        //atributos, metodos get y set, constructor default
        //inicializen a su criterio, constuctor con argumentos
        //metodos para calcular y regresar el valor de perimetro y area
        Circulo clo = new Circulo(13, 21, 14);
        System.out.println("resultados del cirulo");
        System.out.println(clo.Area());
        System.out.println(clo.Radio());
        System.out.println(clo.Perimetro());
        
        
        Circulo clo2 = new Circulo();
        clo2.Area(17);
        clo2.Perimetro(32);
        clo2.Radio(16);
        clo2.imprimirDatos();
    }
    
}
