package com.masterclass.S6;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;

    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;

    }

    public double getAdditionResult(){
        double result = this.firstNumber+this.secondNumber;
        return result;
    }

    public double getSubtractionResult(){
        double result = this.firstNumber-this.secondNumber;
        return result;
    }

    public double getMultiplicationResult(){
        double result = this.firstNumber*this.secondNumber;
        return result;
    }

    public double getDivisionResult(){
        if(this.secondNumber==0){
            return 0;
        }else {
            double result = Math.round(this.firstNumber/this.secondNumber);
            return result;
        }

    }
}
