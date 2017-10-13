package halflives;

import java.util.Scanner;
public class HalfLives {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount, half_lives;
        
        System.out.println("Enter the amount of substance: ");
         amount = input.nextDouble();
        
        System.out.println("Enter the number of half-lives that have past: ");
         half_lives = input.nextDouble();
         
         while (half_lives > 0){
            amount = amount / 2;
            half_lives--;}
        
        System.out.println("The amount remaining is: " + amount);
        
    }
}
