import java.util.*;

public class ReverseTable {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      for(int i=10;i>0;i--){
        System.out.println(n+" X "+i+" = "+n*i);
      }
  }
}