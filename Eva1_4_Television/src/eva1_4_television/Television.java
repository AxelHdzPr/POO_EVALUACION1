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
public class Television {
//Variables    
private int volumen;
private int canal;
private boolean poder;
//Constructores
public Television(){//Constructor default
    volumen=2;
    canal=0;
    poder=false;//Falso= apagado, True= prendido
}
//Metodos para operar la TV (Interfaz)
   //Encender y apagar la tele
public void CambiarEstadoEnergia(){
    if(poder==true){
        poder=false;
    System.out.println("Apagando pantalla");
    }else{
        poder=true;
        System.out.println("Encendiendo pantalla");
    }
}
//Volumen
public void SubirVolumen(){
if(poder == true){ //if (poder la tv est prendida)
    //no debemos de pasar de 100
    if(volumen < 100){
volumen = volumen +1;//Acumulador
//Opcionalmente Volumen++,Volumen+=1
System.out.println("Volumen: " + volumen);
    }
}
}
public void BajarVolumen(){
    if(poder == true){//if poder 
        //
        if(volumen > 0){
    volumen = volumen -1;
    System.out.println("Volumen: " + volumen);
}
}
}
public void cambiarCanalesSubir(){
    if(poder == true){
        if(canal > 100){
            canal = 0;
        }else{ 
            canal = canal + 1;
            System.out.println("canal: " + canal);
        }
}
}
public void cambiarCanalBajar(){
    if(poder == true){
        if (canal < 0){
            canal = 100;
        }else{ 
            canal = canal - 1;
            System.out.println("canal: " + canal);
        }
}
}
}
