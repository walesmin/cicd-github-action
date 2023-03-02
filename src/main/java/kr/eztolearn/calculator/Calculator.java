package kr.eztolearn.calculator;

public class Calculator {

    private int a;
    private int b;
    private int sum;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum() {
        this.sum = a + b;
        return this.sum;
    }

}
