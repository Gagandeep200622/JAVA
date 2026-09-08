// take a number and check  number is divisible 5 and 11

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 5 == 0 && number %11 == 0){
            System.out.println("number is divisible by both");
        }
        else{
            System.out.println("number id not divisible by both");
        }

    }
}
