import java.util.*;


public class Quadratic {
    
    public static void main(String args[])
    {
        int a,b,c;
        double r1,r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("The Values of the a,b,c is");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("To find the root r1 & r2 use the below formula");
        r1 = (-b + Math.sqrt (b*b - 4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("The value of the r1 is" + r1);
        System.out.println("The value of the r2 is" + r2);


    }
}
