package MATH;

import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
        if(checkPrime(n)){
            System.out.println(n+" is PRIME");
        }else{
            System.out.println(n+" is NOT PRIME");
        }
    }
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
