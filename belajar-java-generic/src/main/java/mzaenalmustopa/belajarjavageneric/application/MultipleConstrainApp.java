package mzaenalmustopa.belajarjavageneric.application;

public class MultipleConstrainApp {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<>(new Manager)); // Error Manager tidak implement CanSayHello
        VicePresident.Data<VicePresident> vicePresidentData = new VicePresident.Data<>(new VicePresident());
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }

        public static class Data<T extends Employee> {
            private T data;

            public Data(T data) {
                this.data = data;
            }

            public T getData() {
                return data;
            }

            public void setData(T data) {
                this.data = data;
            }
        }
    }
}
