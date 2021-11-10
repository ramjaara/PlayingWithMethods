package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	System.out.println("How many match stick houses will you build?");
    int numberOfHouses = numberOfHouses();
    System.out.println(6 * numberOfHouses - numberOfHouses + 1 + " matchsticks will be needed");
    }

    public static int numberOfHouses(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
