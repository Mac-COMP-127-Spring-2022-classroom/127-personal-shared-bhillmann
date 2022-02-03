package comp127;

/**
 * File: HelloWorld.java
 * This program prints "hello world"
 */

public class HelloWorld {

    /**
     * This main method starts running the program
     */
    public static void main(String[] args){
        // print a traditional greeting
        System.out.println("Hello World");

        // print out some diagnostic information
        String javaVersion = System.getProperty("java.version"); // the version of java being used
        System.out.println("You are using java version: '"+javaVersion+"'");
        System.out.println("The string shown should start with '12.'");
        System.out.println("If it does not you are likely not using the correct version of java for our class.");

    }
}
