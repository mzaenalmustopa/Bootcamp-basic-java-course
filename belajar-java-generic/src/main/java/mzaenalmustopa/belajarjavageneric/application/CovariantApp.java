package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Topa");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

       // myData.setData(1); tidak boleh karena berbahaya
    }
}
