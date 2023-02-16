/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_television;

/**
 *
 * @author priet
 */
public class Eva1_4_Television {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Metodo() ----> llamada a funcion
Television miTv = new Television(); //la tv empieza apagada
miTv.BajarVolumen();
miTv.CambiarEstadoEnergia();// la encendemos
miTv.BajarVolumen();
miTv.BajarVolumen();
miTv.SubirVolumen();
miTv.cambiarCanalesSubir();
miTv.cambiarCanalesSubir();
miTv.cambiarCanalBajar();
    }
    
}
