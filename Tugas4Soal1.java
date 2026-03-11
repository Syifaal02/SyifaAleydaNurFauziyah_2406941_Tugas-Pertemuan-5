package com.mycompany.Tugas4soal1;

import java.util.Scanner;

public class Tugas4Soal1 {

    static void jumlah(int n) {

        int tambah = 0;

        for (int i = 1; i <= n; i++) {
            tambah += i;
            System.out.print(i);

            if (i < n) {  
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + tambah);
    }

    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.print("Masukan nilai n : ");
        int n = myobj.nextInt();

        jumlah(n);

        myobj.close();
    }
}