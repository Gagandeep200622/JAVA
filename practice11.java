// Find the greatest of three numbers. take numbers input from user

import java.util.*;

public class practice11{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && b < c){
            System.out.println(" a is greater");
        }
         else if(b > c && a < b){
            System.out.println("b is grater");
        }
         else{
            System.out.println("c is greater");
        }

    }
}



