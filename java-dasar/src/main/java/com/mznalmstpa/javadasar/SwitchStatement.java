package com.mznalmstpa.javadasar;

public class SwitchStatement {
    public static void main(String[] args) {
        // Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
        //Switch adalah statement percabangan yang sama dengan if, namun  lebih sederhana cara pembuatannya
        //Kondisi di switch statement hanya untuk perbandingan ==

        var nilai = "A";
        switch (nilai){
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }
    }
}
