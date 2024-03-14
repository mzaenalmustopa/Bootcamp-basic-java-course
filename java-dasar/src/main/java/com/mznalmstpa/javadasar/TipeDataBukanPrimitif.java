package com.mznalmstpa.javadasar;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
        //Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
        //Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
        //Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
        //Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya

        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        short iniShort; // null
        iniShort = 100;

        // Konversi dari tipe data primitif
        int age = 30;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
    }
}
