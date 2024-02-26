import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNum=sc.nextInt();
        System.out.print("Enter second number:");
        int secondNum=sc.nextInt();
        System.out.println("The sum is: "+(firstNum+secondNum));
    }
}
