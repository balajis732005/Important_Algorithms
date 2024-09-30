package MATH;

import java.util.Scanner;

/*
    TIME COMPLEXITY : O(1)
 */

public class Length_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
        System.out.println("LENGTH : "+lengthOfNumber(n));
    }
    public static int lengthOfNumber(int n) {
        return (int) Math.log10(n) + 1;
    }
}
