import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int hcf,lcm,temp,temp1,temp2;
      int n=input.nextInt();
      int n1=input.nextInt();
      temp1=n;
      temp2=n1;
      while(temp2!=0){
        temp=temp2;
        temp2=temp1%temp2;
        temp1=temp;
      }
      hcf=temp1;
      lcm=(n*n1)/temp1;
      System.out.println(hcf);
      System.out.println(lcm);
  }
}