package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Topa");
        MyData<Integer> integerMyData = new MyData<>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
