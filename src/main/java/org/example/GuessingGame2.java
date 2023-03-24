package org.example;

import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {
// need a secret number
// user needs to guess it -take input
// if too high or low, let them know
// if correct let them know

int secretNumber =  9 ;
        System.out.println("Guess my favourite number!");
        Scanner sc = new Scanner(System.in) ;
        String guess = sc.nextLine();
        System.out.println("Your guess was:" + guess);

        if (guess.equals(String.valueOf(secretNumber))) {
            System.out.println("Nice, that is my favourite number!");

        } else if (secretNumber < Integer .valueOf(guess)) {
            System.out.println("Too high, guess again!");
        } else if(secretNumber > Integer .valueOf(guess)) {
            System.out.println("Too low, guess again!");
        }
        }
    }
