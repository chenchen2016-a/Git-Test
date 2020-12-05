package service;

public class CalculationService {
    public double add(double a, double b) {
        if(a<0)
            a = -a;
        return a+b;
    }

    public static void main(String[] args) {

    }
}
