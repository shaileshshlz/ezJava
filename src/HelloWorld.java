import java.util.Scanner;

/*Write a hello world program */

public class HelloWorld{
    public static void main(String[] args){
        System.out.print("Enter a String : ");

        //Scanner class takes input from different sizes
        Scanner input =new Scanner(System.in);

        // input.next(first space) input.nextInt() prints integer
        System.out.println(input.nextLine()); 
    }
}