package com.apple_lab_1;

/**
 * class (parent)
 */
class Tree {
    /**
     * Properties
     */
    double height;
    String type;

    /**
     * Constructor
     * @param type
     * @param height
     */
    Tree(String type, double height) {
        this.type = type;
        this.height = height;
    }

    /**
     * Method
     */
    void print() {
        System.out.println("Tree type is " + this.type);
        System.out.println(this.type + " height is " + this.height);
    }
}
