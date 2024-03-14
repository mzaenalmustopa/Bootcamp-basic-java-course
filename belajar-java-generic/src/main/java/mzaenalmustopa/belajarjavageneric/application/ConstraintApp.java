package mzaenalmustopa.belajarjavageneric.application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);

       // NumberData<String> stringNumberData = new NumberData<String>("topa"); // error
    }

    public static class NumberData<T extends Number>{
        private T number;

        public NumberData(T number) {
            this.number = number;
        }

        public T getNumber() {
            return number;
        }

        public void setNumber(T number) {
            this.number = number;
        }
    }
}
