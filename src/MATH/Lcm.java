package MATH;

import java.util.Scanner;

/*
    NORMAL -> TIME COMPLEXITY : O(a*b)
    EUCLIDEAN -> TIME COMPLEXITY : O(log(Math.min(a,b)))
 */

public class Lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int a = in.nextInt();
        System.out.print("Enter a number 2 : ");
        int b = in.nextInt();
        System.out.println("NORMAL : "+normalLcm(a,b));
        System.out.println("GCD EUCLIDEAN : "+usingEuclideamGcdLcm(a,b));
    }
    public static int normalLcm(int a, int b) {
        int lcm=a*b;
        for(int i=Math.max(a,b);i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        return lcm;
    }
    public static int usingEuclideamGcdLcm(int a, int b) {
        return (a*b) / Gcd.euclideanGcd(Math.min(a,b),Math.max(a,b));
    }
}
