import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int n1=0;
      int temp=n;
      while(n>0){
        int digit=n%10;
        n1=(n1*10)+digit;
        n=n/10;
      }
      System.out.println(n1);
      System.out.println(temp);
      if(temp==n1){
        System.out.println("Palindrome");
      }else{
        System.out.println("Not a Palindrome");
      }
  }
}