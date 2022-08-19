package Q9;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter number one ");
            int q=input.nextInt();
            System.out.print("Enter number tow ");
            int r=input.nextInt();
            int sum=q+r;
            int difference=q-r;
            int product=q*r;
            int average=q/r;
            int distance=Math.abs(q-r);
            int maximum=Math.max(q,r);
            int minimum=Math.min(q,r);
            System.out.println("\nThe sum = "+sum);
            System.out.println("The difference = "+difference);
            System.out.println("The product = "+product);
            System.out.println("The average = "+average);
            System.out.println("The distance = "+distance);
            System.out.println("The maximum = "+maximum);
            System.out.println("The minimum = "+minimum);

    }

}
