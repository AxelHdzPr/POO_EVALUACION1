/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_autos;

/**
 *
 * @author priet
 */
public class Eva1_6_Autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Marca, modelo, placas, año, dueño
        //get y set, constructores default y con argumentos
        //calcular adeudo
        //2000 y anteriores: $1500 
        //2001-2005 $2000
        //2006-2010 $2500
        //2011-2015 $3000
        //2016-2023 $4000
        //imprimir datos (incluir adeudo)
         Autos car = new Autos("Volkswagen","Jetta",2004,"Javier Hernandez","1A7-4R6");
        car.imprimirDatos();
        car.setAño(2006);
        car.imprimirDatos();
        
    }
    
    
}
