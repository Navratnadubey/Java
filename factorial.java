import java.util.*;

public class factorial {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int fact=1;
      for(int i=n;i>0;i--){
        fact =fact*i;
      }
      System.out.println(fact);
  }
}