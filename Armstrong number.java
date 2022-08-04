import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int temp=n;
      int sum=0;
      while(n>0){
        int digit=n%10;
        sum=sum+(digit*digit*digit);
        n=n/10;
      }
      System.out.println(sum);
      if(temp==sum){
        System.out.println("Armstrong Number");
      }else{
        System.out.println("Not a Armstrong");
      }
  }
}