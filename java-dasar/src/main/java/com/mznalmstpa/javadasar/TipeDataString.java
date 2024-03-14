package com.mznalmstpa.javadasar;

public class TipeDataString {
    public static void main(String[] args) {
        // Tipe data String adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks
        //Di Java, tipe data String direpresentasikan dengan kata kunci String
        //Untuk membuat String di Java, kita menggunakan karakter “ (petik dua) sebelum dan setelah teks nya
        //Default value untuk String adalah null

        String firstName = "Zaenal";
        String lastName = "Mustopa";
        // menggabungkan string
        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);

    }
}
