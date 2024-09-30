package MATH;

import java.util.Scanner;

/*
    NORMAL -> TIME COMPLEXITY : O(Math.min(a,b))
    EUCLIDEAN -> TIME COMPLEXITY : O(log(Math.min(a,b)))
 */

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int a = in.nextInt();
        System.out.print("Enter a number 2 : ");
        int b = in.nextInt();
        if(a<b){
            int t=a;
            a=b;
            b=t;
        }
        System.out.println("NORMAL : "+normalGcd(a,b));
        System.out.println("EUCLIDEAN : "+euclideanGcd(a,b));
    }
    public static int normalGcd(int a, int b){
        int gcd=1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static int euclideanGcd(int a, int b){
        if(b==0){
            return a;
        }
        return euclideanGcd(b,a%b);
    }
}
