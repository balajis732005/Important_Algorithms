package MATH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Seive_Of_Erathosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
        System.out.println("PRIME UPTO "+n+" : "+primeUpToN(n));
    }
    public static List<Integer> primeUpToN(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int p=2;p*p<=n;p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        List<Integer> prime = new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(isPrime[i]){
                prime.add(i);
            }
        }
        return prime;
    }
}
