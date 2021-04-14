public class BankCalculatorService {
    public double calculate(int credit , int years, double procent) {
        int months = years * 12;
        double monthProcent = procent / 100 / 12;
        double formula = Math.pow(1 + monthProcent, months);
        return credit * (monthProcent + (monthProcent / (formula - 1)));
    }
}
