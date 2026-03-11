
package com.mycompany.Tugas4Soal1;

import java.util.Scanner;

public class Tugas4Soal3 {
    
    static void faktor(int n){
        if (n<0){
            System.out.print("Nilai tidak boleh kurang dari 0!");
        }
        else if(n == 0){
            System.out.print("Nilai dari 0! = 1");
        }
        else{
            int faktor = 1;
            System.out.print(n + " != ");

            for (int i = n; i >= 1; i--) {
                faktor *= i;
                System.out.print(i);

                if (i > 1) {
                    System.out.print("*");
                }
            }

            System.out.println(" = " + faktor);
        }
    }

    public static void main(String[] args) {

        Scanner myobj3= new Scanner(System.in);
        
        System.out.print("Masukan nilai n : ");
        int n = myobj3.nextInt();
        
        faktor(n);
        
        myobj3.close();
    }
}
