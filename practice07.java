// take the radius and calculate the area and circumference of the circle


import java.util.*;
 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double radius = sc.nextDouble();

         double area = 3.14 *( radius * radius);
         double circumference = 2 * (3.14 * radius);
         System.out.println(" area of circle :" + area);
         System.out.println("circumference : " + circumference);
     }
 }
