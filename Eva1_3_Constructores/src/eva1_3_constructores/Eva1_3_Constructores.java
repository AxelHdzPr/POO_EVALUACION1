/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author prieto
 */
public class Eva1_3_Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta1 = new CuentaBancaria("2", 30, "Axel Hernandez");
        //cuenta1.setNomCliente("Axel Hernandez");
        //cuenta1.setNumCuenta("1");
        //cuenta1.setSaldo(780000); 
        
        System.out.println("Datos del cliente");
        String nombre = cuenta1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        
        CuentaBancaria cuenta2 = new CuentaBancaria("4", 50, "Javier Hernandez");
        System.out.println("Datos del cliente");
        System.out.println(nombre);
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
    }
    
}
