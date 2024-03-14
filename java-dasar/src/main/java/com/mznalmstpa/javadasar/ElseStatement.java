package com.mznalmstpa.javadasar;

public class ElseStatement {
    public static void main(String[] args) {
        // Blok if akan dieksekusi ketika kondisi if bernilai true
        //Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
        //Hal ini bisa dilakukan menggunakan else expression

        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Anda Lulus");
        } else  {
            System.out.println("Anda Tidak Lulus");
        }
    }
}
