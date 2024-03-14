package com.mznalmstpa.javadasar;

public class ForLoop {
    public static void main(String[] args) {
        //For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
        //Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi

        // sintak perulangan for
        //for(init statement; kondisi; post statement){
        //   // block perulangan
        //}
        //Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        //Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
        //Post statement akan dieksekusi setiap kali diakhir perulangan
        //Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true


        // kode perulangan tanpa henti
//        for (;;){
//            System.out.println("perulangan tanpa henti");
//        }

        // kode perulangan dengan kondisi
        var counter = 1;
        for (; counter <= 10; ) {
            System.out.println("Perulangan Ke- " + counter);
            counter++;
        }

        // perulangan denga initstatement
        for (var counter1 = 1; counter1 <= 10;){
            System.out.println("perulangan ke - " +counter);
            counter++;
        }

        // perulangan denga post statement
        for (var counter3 = 1; counter3 <= 10 ; counter3++){
            System.out.println("Perulangan Ke -"+counter3);
        }
    }
}
