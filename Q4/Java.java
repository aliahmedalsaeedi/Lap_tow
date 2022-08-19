package Q3;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        System.out.println("Enter three numbres :");
        Scanner input=new Scanner(System.in);
        int p=input.nextInt();
        int s=input.nextInt();
        int g=input.nextInt();
        int sum=p+s+g;
        float avr;
        avr=sum/3;
        System.out.println("your numbres is p ="+p);
        System.out.println("your numbres is s ="+s);
        System.out.println("your numbres is g ="+g);
        System.out.println("suming = "+(p+s+g));
        System.out.println("Average = "+avr);
    }
}
