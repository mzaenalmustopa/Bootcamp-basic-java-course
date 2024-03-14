package com.mznalmstpa.javadasar;

public class TipeDataArray {
    public static void main(String[] args) {

        //Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        //Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Topa";
        arrayString[1] = "Mustopa";
        arrayString[2] = "Zaenal";

    //    arrayInitializer

        int [] arrayInt = new int[]{
                10,20,30,40,50
        };

        long[] arrayLong = {
                10, 90 , 80 , 67 , 29
        };
        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong[arrayLong.length]);

        // operasi di array
        // array[index] = mengambil data di array
        // array[index] = value | = mengambil data di array\
        // array.length = mengambil panjang array

        // array di dalam array
        String[][] member = {
                {"muhamad", "zaenal", "mustopa"},
                {"muhamad", "zaenal", "mustopa"},
                {"muhamad", "zaenal", "mustopa"},
        };

        String[] member1 = member[0];
        System.out.println(member1[0]);

        System.out.println(member[1][0]);
        System.out.println(member[2][0]);
    }
}
