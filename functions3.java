// write a function to print the product of two numbers and return product

import java.util.*;

public class Main{
    public static int calculateProduct(int a, int b){

        return a * b;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();


        System.out.println(calculateProduct(a ,b));

    }
}
