/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_calificaciones;

/**
 *
 * @author priet
 */
public class Eva1_12_Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //calificacion en estilo eeuu
        //91 --> 100 A
        //81 --> 90 B
        //71 --> 80 C
        //Menor a 70 D
        //Recibe la calificacion numerica entera, regresan las calificaciones como letras
        //Capturan el valor regresado por la funcion, la imprimen
        String calis;
        calis = calis(87);
        System.out.println("Calificaciom para 87: " + calis);
        System.out.println("Calificaciom para 58: " + calis(58));
        calis(100);//ignoro el resultado
    }
        public static String calis (int calis){
            if ((calis >= 91) && (calis <= 100)){
                return "A";
            }else if((calis >= 81) && (calis <= 90)){
                return "B";
            }else if((calis >= 71) && (calis <= 80)){
                return "C"; 
            }else{
                return "D";
        }
        }
}