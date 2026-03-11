package com.mycompany.Tugas4Soal1;

import java.util.Scanner;

public class Tugas4Soal2 {
    
    static void ganjil(int awal, int akhir){
        int jmlGanjil = 0;
        int i = awal;

        System.out.print("Bilangan Ganjil : ");

        while (i <= akhir) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                jmlGanjil++;  
            }
            i++;
        }

        System.out.println();
        System.out.println("Jumlah bilangan ganjil : " + jmlGanjil);
    }

    public static void main(String[] args) {

        Scanner myobj2 = new Scanner(System.in);

        System.out.print("Masukan batas awal nilai : ");
        int awal = myobj2.nextInt();

        System.out.print("Masukan batas akhir nilai : ");
        int akhir = myobj2.nextInt();
        
        ganjil(awal, akhir);

        myobj2.close();
    }
}