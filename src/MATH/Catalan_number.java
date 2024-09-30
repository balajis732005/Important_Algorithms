package MATH;

import java.util.Scanner;

public class Catalan_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = in.nextInt();
        System.out.println("RECURSION : "+nthCatalanRec(n));
        System.out.println("DP1 : "+nthCatalanIterDP1(n));
        System.out.println("DP2  : "+nthCatalanIterDP2(n));
    }
    public static int nthCatalanRec(int n) {
        int res = 0;
        if(n<=1){
            return 1;
        }
        for(int i=0;i<n;i++){
            res += (nthCatalanRec(i)*nthCatalanRec(n-i-1));
        }
        return res;
    }
    public static int nthCatalanIterDP1(int n) {
        int[] catalan = new int[n+1];
        catalan[0]=1;
        catalan[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                catalan[i] += (catalan[j]*catalan[i-j-1]);
            }
        }
        return catalan[n];
    }
    public static int nthCatalanIterDP2(int n) {
        int[] catalan = new int[n+1];
        catalan[0]=1;
        catalan[1]=1;
        for(int i=2;i<=n;i++){
            catalan[i] = (catalan[i-1] * ((4*i)-2))/(i+1);
        }
        return catalan[n];
    }
}
