
import java.util.*;

public class Area2 {
    public static void main(String args[])
    {
        int a,b,c;
        float s,Area;
        System.out.println("The sum of a+b+c is");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a+b+c)/2f;
        System.out.println("The sum all is " + s);
        Area = (s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the traingle is " + Math.sqrt(Area));
        
    }
    
}
