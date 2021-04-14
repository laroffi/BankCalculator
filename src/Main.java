public class Main {
    public static void main(String[] args) {
        BankCalculatorService service = new BankCalculatorService();
        double payment = service.calculate(1_000_000, 1, 9.99);
        System.out.println((int)payment);
    }
}
