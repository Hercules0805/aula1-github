package com.masterclass.S6;

public class Teste {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(7);
        calculator.setSecondNumber(3);

        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());

    }
}
