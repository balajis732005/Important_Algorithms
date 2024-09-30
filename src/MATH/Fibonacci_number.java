package MATH;

import java.util.Scanner;

/*
    RECURSION -> TIME COMPLEXITY : O(2^n)
    DP -> TIME COMPLEXITY : O(n)
 */

public class Fibonacci_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
        System.out.println("DP : "+fiboDp(n));
        System.out.println("RECURSION : "+fiboRec(n));
    }
    public static long fiboDp(int n){
        long[] dp = new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static long fiboRec(int n){
        if(n<2){
            return n;
        }
        return fiboRec(n-1)+fiboRec(n-2);
    }
}
