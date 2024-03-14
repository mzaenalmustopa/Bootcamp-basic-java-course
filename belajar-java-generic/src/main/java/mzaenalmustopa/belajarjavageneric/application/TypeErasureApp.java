package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        // ini cukup berbahaya karena menghilangkan keterangan generic
        // bisa menyebabkan error saat di run
        MyData myData = new MyData("Topa");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
