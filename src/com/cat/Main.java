package com.cat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 4;
        int k = 4;
        int[][] array = new int[m + 2][k + 2];
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                System.out.print("Enter " + i + j + " element : ");
                array[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
        int islandSpace = 0;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j] == 1 && array[i][j + 1] == 0) {
                    islandSpace++;
                }
                if (array[i][j] == 1 && array[i][j - 1] == 0) {
                    islandSpace++;
                }
                if (array[i][j] == 1 && array[i + 1][j] == 0) {
                    islandSpace++;
                }
                if (array[i][j] == 1 && array[i - 1][j] == 0) {
                    islandSpace++;
                }
            }
        }
        System.out.println("Island space is " + islandSpace);
    }
}
