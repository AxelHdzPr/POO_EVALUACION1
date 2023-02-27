/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_static2;

/**
 *
 * @author priet
 */
public class FormulasGeometria {
    //Constante
    public static final double pi = 3.14159;
    //Areas
    public static double areaTriangulo(double base, double altura){
        return (base*altura/2);
    }
    public static double areaCirculo(double radio){
        return pi * radio * radio;
    }
    //perimetro
    public static double perimetoCirculo(double radio){
        return pi * (radio*2);
    }
    //Volumen esfera
    public static double volumenEsfera(double radio){
        return ((4.0/3.0)*pi*(radio*radio*radio));
    }
    
}
