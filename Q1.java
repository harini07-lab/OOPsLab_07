package Lab7;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, months;
        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        rate = sc.nextDouble();
        System.out.print("Enter number of months: ");
        months = sc.nextDouble();
        double r = rate / 100;
        double time = months / 12;
        double interest = principal * r * time;
        double balance = principal + interest;
        System.out.println("Interest: " + interest);
        System.out.println("Final Balance: " + balance);
        sc.close();
    }
}
