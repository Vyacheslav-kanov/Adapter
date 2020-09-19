public class Main {

    private static IntsCalculator calculator = new IntsCalculator();
    public static void main(String[] args) {


        System.out.println("mult = " + calculator.mult(10, 20));

        System.out.println("pow = " + calculator.pow(20, 2));

        System.out.println("sum = " + calculator.sum(7, 10));
    }
}
