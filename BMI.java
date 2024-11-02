
package bmi;

import java.util.Scanner;

public class BMI {

    
    public static void main(String[] args) {
        
        Scanner masukan = new Scanner(System.in);
        
        int jk;
        float berat,tinggi,bmi, meter;
        
        System.out.println("BMI KALKULATOR");
        System.out.println("JENIS GENDER (1.MAN) | (2.WOMAN) : ");
        jk = masukan.nextInt();
        System.out.println("BERAT BADAN : ");
        berat = masukan.nextFloat();
        System.out.println("TINGGI BADAN : ");
        tinggi = masukan.nextFloat();
        
        meter=tinggi/100;
        bmi=(berat/(meter*meter));
        
        System.out.println("=====================");
        System.out.println("BMI : "+bmi+" ");
        
        if(bmi <18.5){
            System.out.println("UNDERWEIGHT");
        }
        else if(bmi <=22.9) {
            System.out.println("NORMAL");
        }
        else if(bmi <=24.9) {
            System.out.println("OVERWEIGHT");
        }
        else {
            System.out.println("OBESE");
        }
    }
    
}
