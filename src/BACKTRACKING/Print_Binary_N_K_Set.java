package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_Binary_N_K_Set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length od Binary String : ");
        int n = in.nextInt();
        System.out.print("Enter the No.of Bits to Set : ");
        int k = in.nextInt();
        String str = "0".repeat(n);
        List<String> biComb = binaryKSet(new StringBuilder(str),0,k,0,n);
        System.out.println(biComb);
    }
    public static List<String> binaryKSet(StringBuilder bi,int set,int k,int ind,int n){
        List<String> biComb = new ArrayList<>();
        if(set==k){
            biComb.add(bi.toString());
            return biComb;
        }
        for(int i=ind;i<n;i++){
            bi.replace(i,i+1,"1");
            biComb.addAll(binaryKSet(bi,set+1,k,i+1,n));
            bi.replace(i,i+1,"0");
        }
        return biComb;
    }
}
