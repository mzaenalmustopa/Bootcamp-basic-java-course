package com.mznalmstpa.javadasar;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
        //Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
        //Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya

        var counter = 1;
        while (true){
            System.out.println("perulangan ke-" + counter);
            counter++;

            if (counter > 10){
                break;
            }
        }

        for (int counter2 = 1; counter2 <= 100; counter2++){
            if (counter2 % 2 == 0){
                continue;
            }

            System.out.println("Perulangan Ganjil - " + counter2);
        }
    }
}
