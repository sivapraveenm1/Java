import java.util.*;
public class Area {
    
    public static void main(String args[])
    {
        float base,height,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("The base & height of the traingle is");
         base = sc.nextFloat();
         height = sc.nextFloat();
         area = (base*height)/2;
        System.out.println("The area of the traingle is" + area);
    }

}
