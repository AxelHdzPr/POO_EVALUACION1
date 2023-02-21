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
public class Autos {
    private String marca;
    private String modelo;
    private String dueño;
    private String placas;
    private int año;
    //constructor
    public Autos(){//default
        marca = "Volkswagen";
        modelo = "Jetta";
        dueño = "Javier Hernandez";
        placas = "973-KGB";
        año = 2004;
    }
    public Autos(String marcaAuto, String modeloAuto, int añoAuto, String dueñoAuto, String placasAuto){//constructor con argumentos
    marca = marcaAuto;
    modelo = modeloAuto;
    año = añoAuto;
    dueño = dueñoAuto;
    placas = placasAuto;
    }
    //metodos get y set
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getDueño(){
        return dueño;
    }
    public int getAño(){
        return año;
    }
    public String getPlacas(){
        return placas;
    }
    public void setMarca (String marcaAuto){
        marca = marcaAuto;
    }
    public void setModelo (String modeloAuto){
        modelo = modeloAuto;
    }
    public void setDueño (String dueñoAuto){
        dueño = dueñoAuto;
    }
    public void setAño (int añoAuto){
        año = añoAuto;
    }
    public void setPlacas (String placasAuto){
        placas = placasAuto;
    }
    public int calRevalidacion(){
        int adeudo = 0;
        if(año <= 2000){
            adeudo = 1500;
        }
        else if((año >= 2001) && (año <= 2005)){
            adeudo = 2000;
        }
        else if((año >= 2006) && (año <= 2010)){
            adeudo = 2500;
        }
        else if((año >= 2011) && (año <= 2015)){
            adeudo = 3000;
        }
        else{
            adeudo = 4000;
        }
        return adeudo;
    }
    public void imprimirDatos(){
        System.out.println("ADEUDO VEHICULAR: ");
        System.out.println("DUEÑO: " + dueño);
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("PLACAS: " + placas);
        System.out.println("AÑO: " + año);
        System.out.println("ADEUDO: " + calRevalidacion());
    }
}
