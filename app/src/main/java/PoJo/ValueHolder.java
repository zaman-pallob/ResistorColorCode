package PoJo;

public class ValueHolder {
    double multiplier=100,tolerance,temcoefficient;


    int digit1,digit2,digit3;
    public String getDigit1() {
        return String.valueOf(digit1);
    }

    public void setDigit1(int digit1) {
        this.digit1 = digit1;
    }

    public String getDigit2() {
        return String.valueOf(digit2);
    }

    public void setDigit2(int digit2) {
        this.digit2 = digit2;
    }

    public String getDigit3() {
        return String.valueOf(digit3);
    }

    public void setDigit3(int digit3) {
        this.digit3 = digit3;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getTolerance() {
        return tolerance;
    }

    public void setTolerance(double tolerance) {
        this.tolerance = tolerance;
    }

    public double getTemcoefficient() {
        return temcoefficient;
    }

    public void setTemcoefficient(double temcoefficient) {
        this.temcoefficient = temcoefficient;
    }
}
