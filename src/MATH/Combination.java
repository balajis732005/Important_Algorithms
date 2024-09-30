package MATH;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = in.nextInt();
        System.out.print("Enter r : ");
        int r = in.nextInt();
        System.out.println("nCr : "+nCr(n,r));
    }
    public static int nCr(int  n,int r){
        if(r>n-r){
            r=n-r;
        }
        int res = 1;
        for(int i=0;i<r;i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
}
