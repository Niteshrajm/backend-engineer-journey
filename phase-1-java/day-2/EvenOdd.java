import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("The given number "+a+" is a Even number");
        } else {
          System.out.println("The given number "+a+" is a Odd number");
        }
        sc.close();
    }
}
