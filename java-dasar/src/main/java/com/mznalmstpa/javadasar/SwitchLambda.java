package com.mznalmstpa.javadasar;

public class SwitchLambda {
    public static void main(String[] args) {
        //Di Java versi 14, diperkenalkan switch expression dengan lambda
        //Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break

        var nilai = "A";
        switch (nilai){
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B","C" -> System.out.println(" Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah jurusan");
            }
        }
    }
}
