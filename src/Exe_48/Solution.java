package Exe_48;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        int randomNumber = (int)(Math.random() * (1000+1));
        guessGame(randomNumber);

    }
    
    private static void guessGame(int randomNumber) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int guess = -1;
        
        while(guess!=randomNumber) {
            System.out.println("Guess the number ");
            guess = sc.nextInt();
            
            if(guess > randomNumber)
                System.out.println("Too high");
            else if(guess < randomNumber)
                System.out.println("Too low");
            
            count++;
        }
        
        System.out.println("You guessed it right in " + count+ " step");
        sc.close();
    }
}
