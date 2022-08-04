import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n>=1 && n<12){
            System.out.println("good morning");
        }else if(n>=12 && n<=16){
            System.out.println("good afternoon");
        }else if(n>16 && n<=20){
            System.out.println("good evening");
        }else if(n>20 && n<=24){
            System.out.println("good night");
        }else {
            System.out.println("invalid input");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}