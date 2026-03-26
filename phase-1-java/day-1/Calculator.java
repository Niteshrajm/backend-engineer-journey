import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("The sum of two number is :"+(a+b));
        System.out.println("The difference of two number is :"+(a-b));
        System.out.println("The multiplication of two number is :"+(a*b));
    }
}
