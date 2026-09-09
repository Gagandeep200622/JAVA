// check whether a number is two digit or not

import java.util.*;

public class practice15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n >= 10 && n <= 99) || ( n>= -10 && n <= -99)){
            System.out.println("given number is two digit number ");

        }
        else{
            System.out.println("not two digit number");
        }
    }
}
