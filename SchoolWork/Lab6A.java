//Class: CSE 1321L
//Section: J02
//Term: Spring 2022
//Instructor: Gopi Macha
//Name: Nathan Ly
//Lab#: Lab6


import java.util.Scanner;
public class Lab6A {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int big = 0;

        System.out.println("Please enter 10 numbers and this program will display the largest.");
        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.print("Please enter number "+i+":");
            int num = cc.nextInt();
            if (num > big) {
                big = num;
            }
        }

        System.out.println();
        System.out.println("The largest number was "+ big);
    }
}