package com.mznalmstpa.javadasar;

public class Final {
    public static void main(String[] args) {
        // Secara default, variable di Java bisa diubah-ubah nilainya
        //Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final
        //Istilah variabel seperti ini, banyak juga yang menyebutnya konstan

        final String name = "Muhamad Zaenal Mustopa";
        var age = 20;
        var address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
