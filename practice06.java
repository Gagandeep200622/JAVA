// take the input from user and calculate the simple interest

import java.util.*;

public class practice06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double P =sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double si = (P * R * T)/100;

        System.out.println("simple interest is :" + si);
    }
}
