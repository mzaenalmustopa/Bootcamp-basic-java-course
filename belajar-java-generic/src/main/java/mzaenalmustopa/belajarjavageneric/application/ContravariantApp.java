package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("topa");
        MyData<? super String> myData = objectMyData;

        process(myData);

        System.out.println(objectMyData.getData());

    }

    public static void process(MyData<? super String> myData) {

    }
}
