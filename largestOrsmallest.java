import java.util.*;

public class largestOrsmallest {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      System.out.println("Largest Number is:");
      if(a>b && a>c){
        System.out.println(a);
      }else if(b>a && b>c){
        System.out.println(b);
      }else if(c>a && c>b){
        System.out.println(c);
      }
      System.out.println("Smallest number is:");
      if(a<b && a<c){
        System.out.println(a);
      }else if(b<a && b<a){
        System.out.println(b);
      }else if(c<a && c<b){
        System.out.println(c);
      }
  }
}