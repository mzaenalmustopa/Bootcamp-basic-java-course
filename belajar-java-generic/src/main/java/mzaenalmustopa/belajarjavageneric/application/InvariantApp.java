package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Topa");
        // doIt(StringMyData); // Error
        // MyData<Object> objectMyData = stringMyData; // Error

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; // error
        // doItInteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData){
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData) {
        // do nothing
    }
}
