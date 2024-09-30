package MATH;

/*
    EULER'S TOTIENT FUNCTION :
    Count of from {1,2,...,n-1} has GCD with n is 1.
                   (OR)
    Count of numbers less than n has relatively prime to n;
 */

import java.util.Scanner;

public class Eulers_totient_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
        System.out.println("COUNT OF GCD(number,n)==1 : "+eulerTotientFunction(n));
    }
    public static int eulerTotientFunction(int n){
        int res = n;
        for(int p=2;p*p<=n;p++){
            if(n%p==0){
                while(n%p==0){
                    n/=p;
                }
                res -= (res/p);
            }
        }
        if(n>1){
            res -= (res/n);
        }
        return res;
    }
}
