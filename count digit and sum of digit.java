import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int count=0;
      int sum=0;
      while(n>0){
        int digit=n%10;
        n=n/10;
        sum=sum+digit;
        count++;
      }
      System.out.println(count);
      System.out.println(sum);
  }
}