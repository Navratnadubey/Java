import java.util.*;

public class areaofCircleAndReactangle {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Area of Rectangle");
      int l=input.nextInt();
      int b=input.nextInt();
      System.out.println(l*b);
      System.out.println("Area of Circle");
      int r=input.nextInt();
      Double A=Math.PI*r*r;
      System.out.println(A);
  }
}