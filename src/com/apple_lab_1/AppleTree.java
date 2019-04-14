package com.apple_lab_1;

import java.util.ArrayList;

/**
 * Class (child)
 */
class AppleTree extends Tree {
    /**
     * Property
     */
    private ArrayList<Apple> apples = new ArrayList<>();

    /**
     * Constructor
     * @param height
     */
    AppleTree(double height) {
        super("AppleTree", height);
        System.out.println("AppleTree created");
    }

    /**
     * Method
     * @param apple
     */
    void addApple(Apple apple) {
        this.apples.add(apple);
    }

    /**
     * Method
     * @return
     */
    int applesCount() {
        return this.apples.size();
    }

    /**
     * Method
     * @return
     */
    double applesWeight() {
        double weight = 0;
        for(Apple apple: this.apples) {
            weight += apple.weight;
        }
        return weight;
    }

    /**
     * Method
     */
    void print() {
        super.print();
        System.out.println("Apples count: " + this.applesCount());
        System.out.println("Apples weight: " + this.applesWeight());
    }
}
