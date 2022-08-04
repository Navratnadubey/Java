import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int a=input.nextInt();
      int fact=1;
      for(int i=a;i>=1;i--){
        fact=fact*i;
      }
      System.out.println(fact);
  }
}