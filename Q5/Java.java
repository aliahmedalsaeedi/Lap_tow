package Q4;

public class Java {
    public static void main(String[] args) {
        int x=10;
        int d=20;
        System.out.println("Before Swap");
        System.out.println("x = "+x);
        System.out.println("d = "+d);
        int temp=x;
        x=d;
        d=temp;
        System.out.println("After swap");
        System.out.println("x = "+x);
        System.out.println("d = "+d);
    }
}
