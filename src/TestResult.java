//package test;
import java.util.Scanner;  
//import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); 
        System.out.println("First string:");
        String s1 = console.nextLine();
        System.out.println("Second string:");
        String s2 = console.nextLine();
        console.close();
        System.out.println("Anagram = "+Exercise.Calculate(s1,s2));
    }
}
