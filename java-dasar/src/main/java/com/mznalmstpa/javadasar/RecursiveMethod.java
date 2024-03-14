package com.mznalmstpa.javadasar;

public class RecursiveMethod {
    public static void main(String[] args) {
        //Recursive method adalah kemampuan method memanggil method dirinya sendiri
        //Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial

        System.out.println(factorialLoop(100));
        System.out.println(factorialRecursive(10));
    }

    static int factorialLoop(int value){
        var result = 1;

        for (var counter = 1; counter <= value; counter++){
            result += counter;
        }

        return result;
    }

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * factorialLoop(value-1);
        }
    }

    // Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
    //Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
    //Kenapa problem ini  bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow
}
