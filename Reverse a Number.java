import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      while(n>0){
        int digit=n%10;
        n=n/10;
        System.out.print(digit);
      }
  }
}