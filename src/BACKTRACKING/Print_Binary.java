package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a limit : ");
        int n = in.nextInt();
        List<String> binary = generateBinary(n,"");
        System.out.println(binary);
    }
    public static List<String> generateBinary(int n,String ds) {
        List<String> binary = new ArrayList<>();
        if(ds.length()==n){
            binary.add(ds);
            return binary;
        }
        binary.addAll(generateBinary(n, ds + '0'));
        binary.addAll(generateBinary(n, ds + '1'));
        return binary;
    }
}
