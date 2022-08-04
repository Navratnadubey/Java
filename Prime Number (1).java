import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      boolean flag=false;
      for(int i=2;i<n/2;i++){
        if(n%i==0){
          flag=true;
          break;
        }
      }
      if(!flag){
      System.out.println("Prime");
      }else{
        System.out.println("Not a prime");
      }
  }
}