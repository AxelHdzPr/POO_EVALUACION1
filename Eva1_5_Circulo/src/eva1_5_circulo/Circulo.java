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
public class Circulo {
    private double area;
    private double radio;
    private double perimetro;
    
    public Circulo(double rArea, double rRadio, double rPerimetro){
        area = rArea;
        radio = rRadio;
        perimetro = rPerimetro;
    }
    public Circulo (){
        area = 17;
        radio = 19;
        perimetro = 27;
    }
    public double Area(){
        area = Math.PI*radio*radio;
        return area;
    }
    public double Radio(){
        return radio;
    }
    public double Perimetro(){
        perimetro = Math.PI*(radio*2);
        return perimetro;
    }
    public void Area(double vArea){
        area = Math.PI*radio*radio;
    }
    public void Radio(double vRadio){
        radio = vRadio;
    }
    public void Perimetro(double vPerimetro){
        perimetro = Math.PI*(radio*2);
    }
    public void imprimirDatos(){
        System.out.println("Resultados del circulo 2:");
        System.out.println("Radio: " + radio);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
