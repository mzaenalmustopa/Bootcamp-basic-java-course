package com.mznalmstpa.javadasar;

public class Yield {
    public static void main(String[] args) {

        // Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
        //Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement

        // switch tanpa yield
        var nilai = "A";
        String ucapan;

        switch (nilai){
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B","C" -> ucapan = " Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah jurusan";
        }

        System.out.println(ucapan);

        // switch dengan yield
        var nilai1 = "A";
        String ucapan1 = switch (nilai1){
            case "A":
                yield "WOW ANDA LULUS DENGAN BAIK";
            case "B","C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan1);

    }
}
