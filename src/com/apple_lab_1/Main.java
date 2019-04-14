package com.apple_lab_1;

import java.util.Scanner;

/**
 * Main application class
 */
public class Main {

    /**
     * application entry point
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Start working");

        // Console Scanner
        Scanner in = new Scanner(System.in);

        // Apple tree initialisation
        System.out.println("Enter Apple tree height");
        double appleTreeHeight = in.nextDouble();
        if(appleTreeHeight <= 0) {
            System.err.println("Invalid Apple tree height");
            return;
        }
        AppleTree appleTree = new AppleTree(appleTreeHeight);


        // Apples initialisation 1 - read count of apples
        System.out.println("Enter apples count");
        int applesCount = in.nextInt();

        if(applesCount <= 0) {
            System.err.println("Invalid count of apples");
            return;
        }

        // Apples initialisation 1 - Create apples
        for(int i = 1; i <= applesCount; i++) {
            // Read apple each apple params
            System.out. println("Enter weight for apple " + i);
            int weight = in.nextInt();
            if(weight <= 0) {
                System.err.println("Invalid apple weight");
                return;
            }
            // add apple to tree
            appleTree.addApple(new Apple(weight));
        }

        // print apple info
        appleTree.print();

        System.out.println("Work finished");
    }
}
