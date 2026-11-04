package week4;


import java.util.Scanner;

public class SimpleInterestCalculator {
    private double principal;
    private double rate;
    private double time;
    private double simpleInterest;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleInterestCalculator calc = new SimpleInterestCalculator();

        System.out.print("Enter Principal: ");
        calc.principal = scanner.nextDouble();

        System.out.print("Enter Rate (%): ");
        calc.rate = scanner.nextDouble();

        System.out.print("Enter Time (years): ");
        calc.time = scanner.nextDouble();

        calc.simpleInterest = (calc.principal * calc.rate * calc.time) / 100.0;

        System.out.println("Simple Interest: " + calc.simpleInterest);
        scanner.close();
    }
}





    

