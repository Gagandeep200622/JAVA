// take a number and check a number is positive ,negative or zero

import java.util.*;

public class practice09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("number is positive");
        }

        else if(a < 0){
            System.out.println("number is negative");
        }
        else if( a == 0){
            System.out.println(" number is zero");
            }
        else{
            System.out.println(" enterd number is invalid");
        }
    }
}