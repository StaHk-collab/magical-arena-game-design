package main.java.com.arena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // PlayerA
            System.out.println("Details for PlayerA"); // 50, 5, 10

            System.out.println("Enter the initial health value of PlayerA :");
            int healthA = sc.nextInt();

            System.out.println("Enter the initial strength value of PlayerA :");
            int strengthA = sc.nextInt();

            System.out.println("Enter the initial attack value of PlayerA :");
            int attackA = sc.nextInt();

            Player playerA = new Player(healthA, strengthA, attackA);

            // PlayerB
            System.out.println("Details for PlayerB"); // 100, 10, 5

            System.out.println("Enter the initial health value of PlayerB :");
            int healthB = sc.nextInt();

            System.out.println("Enter the initial strength value of PlayerB :");
            int strengthB = sc.nextInt();

            System.out.println("Enter the initial attack value of PlayerB :");
            int attackB = sc.nextInt();

            Player playerB = new Player(healthB, strengthB, attackB);

            Arena arena = new Arena();
            arena.startMatch(playerA, playerB);

            if (playerA.getHealth() == 0) {
                System.out.println("PlayerB wins !");
            } else {
                System.out.println("PlayerA wins !");
            }
        } finally {
            sc.close();
        }
    }
}