import java.util.*;
public class fahreheitTocelsius
{    
    public static void main(String[] args) {
    float celsius, n;
    Scanner sc = new Scanner(System.in);
      n= sc.nextFloat();
    System.out.println("Fahrenheit Temperature :"+n);
    celsius = ((n-32)*5)/9;
    System.out.printf("Celsius = %.2f",celsius);
}
}