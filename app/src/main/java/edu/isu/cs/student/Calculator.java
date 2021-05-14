package edu.isu.cs.student;

public class Calculator {

    public double add(double x, double y){
        return x-y;
    }
    public double subtract(double x, double y){
        return x-y;
    }
    public double multiplication(double x, double y){
        return x*y;
    }
    public long power(long x, long powerTo){
        long result = (long) Math.pow(x,powerTo);

        return result;
    }
    public double division(double x, double y){
        return  x/y;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
       //c.power(2,2);
        System.out.println(c.power(3,3));
    }
}
