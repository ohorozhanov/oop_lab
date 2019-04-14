package com.apple_lab_1;

/**
 * class
 */
class Apple {
    /**
     * property
     */
    double weight;

    /**
     * Default Constructor
     */
    Apple() {
        this.weight = 0.1;
        System.out.println("Apple created");
    }

    /**
     * Constructor Overload
     * @param weight
     */
    Apple(double weight) {
        this.weight = weight;
        System.out.println("Apple created");
    }
}
