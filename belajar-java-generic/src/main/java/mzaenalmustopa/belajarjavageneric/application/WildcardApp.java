package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<>(100));
        print(new MyData<>("Topa"));
        print(new MyData<>(new MultipleConstrainApp.Manager()));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
