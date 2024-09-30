package MATH;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    TIME COMPLEXITY : O(Sqrt(n)/log(n))
 */

public class Prime_factorization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
        System.out.println("PRIME FACTORS: ");
        System.out.println(primeFactorization(n));
    }
    public static Map<Integer,Integer> primeFactorization(int n) {
        Map<Integer,Integer> factors = new HashMap<>();
        //Factor 2 -> even n
        while(n%2==0){
            if(factors.containsKey(2)){
                factors.put(2,factors.get(2)+1);
            }else{
                factors.put(2,1);
            }
            n/=2;
        }
        //Other factors odd
        for(int i=3;i*i<=n;i++){
            while(n%i==0) {
                if (factors.containsKey(i)) {
                    factors.put(i, factors.get(i) + 1);
                } else {
                    factors.put(i, 1);
                }
                n/=i;
            }
        }
        // n or initial n is prime
        if(n>2){
            if (factors.containsKey(n)) {
                factors.put(n, factors.get(n) + 1);
            } else {
                factors.put(n, 1);
            }
        }
        return factors;
    }
}
