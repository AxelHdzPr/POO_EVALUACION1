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
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        claseB objB = new claseB();
        //objB.publicB; Atributos visibles
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.publicC; Atributos visibles
        //objC.defaultC;
         
        //ClaseD es default en otro archivo
        //pero mismo paquete
        claseD objD = new claseD();
        //objD.publicD; Atributos visibles
        //objD.defaultD;
        
        //La claseD esta en otro paquete y archivo
        //Hay que agregar la clausula import....
        ClaseE objE = new ClaseE();
        //objE.publicE; Solo el atributo publico
        
       //Clase F es es default y es invisible para las clases de este paquete1
        claseF objF = new claseF();
    }
    
}
class claseB{
    public int publicB;
    int defaultB;
    private int privateB;
}
