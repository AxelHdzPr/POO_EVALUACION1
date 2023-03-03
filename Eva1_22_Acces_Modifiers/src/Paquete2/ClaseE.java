/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

/**
 *
 * @author priet
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public class prueba{
     public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA; Atributos visibles
        //objA.defaultA;
        
        claseB objB = new claseB();
        //objB.publicB; Atributos visibles
        //objB.defaultB;
   
        ClaseC objC = new ClaseC();
        //objC.publicC;
        
        claseD objD = new claseD();
        //objD.publicD; Atributos visibles
        //objD.defaultD;
       
        ClaseE objE = new ClaseE();
        //objE.publicE; Solo el atributo publico
        
        claseF objF = new claseF();
        //objF.publicF;
        //objF.defaultF;
        
        
}
}
class claseF{
    public int publicF;
    int defaultF;
    private int privateF;
}
