/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author priet
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA; Atributos visibles
        //objA.defaultA;
        
        claseB objB = new claseB();
        //objB.publicB; Atributos visibles
        //objB.defaultB;
   
        claseD objD = new claseD();
        //objD.publicD; Atributos visibles
        //objD.defaultD;
       
        ClaseE objE = new ClaseE();
        //objE.publicE; Solo el atributo publico
        
}
}
class claseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
