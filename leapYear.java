import java.util.*;

public class leapYear {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    if(n%400==0 || n%4==0){
      System.out.println("Leap year");
    }else {
      System.out.println("Not a Leap Year");
    }
  }
}