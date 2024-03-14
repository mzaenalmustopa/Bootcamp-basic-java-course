package com.mznalmstpa.javadasar;

public class ForEach {
    public static void main(String[] args) {
        // Kadang kita biasa mengakses data array menggunakann perulangan
        //Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
        //Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis

        // tanpa for each
        String[] array = {
                "Eko", "Khannedy", "Mustopa",
                "Programmer","Zaman","Now"
        };

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        // for each
        String[] array1 = {
                "Eko","Kurniawan","Khannedy",
                "Programmer","Zaman","Now"
        };

        for (var value : array1){
            System.out.println(value);
        }
    }
}
