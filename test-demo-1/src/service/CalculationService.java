package service;

public class CalculationService {
    public double add(double a, double b) {
        if(a<0)
            a = -a;
        return a+b;
    }
    public double sub(double a, double b) {
        return a-b;
    }
}
