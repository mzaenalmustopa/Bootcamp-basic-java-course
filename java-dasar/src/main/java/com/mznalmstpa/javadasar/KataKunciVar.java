package com.mznalmstpa.javadasar;

public class KataKunciVar {
    public static void main(String[] args) {

        //Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var, sehingga kita tidak perlu menyebutkan tipe datanya
        //Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value / nilai dari variable tersebut secara langsung

        //  var name;  error
//      name = "Eko Kurniawan Khannedy";

        var age = 30;
        var address = "Indonesia";

        System.out.println(age);
        System.out.println(address);
    }
}
