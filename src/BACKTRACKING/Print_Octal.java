package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_Octal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a limit : ");
        int n = in.nextInt();
        List<String> octal = generateOctal(n,"");
        System.out.println(octal);
    }
    public static List<String> generateOctal(int n, String ds) {
        List<String> octal = new ArrayList<String>();
        if(ds.length()==n){
            octal.add(ds);
            return octal;
        }
        for(char i='0';i<='7';i++){
            octal.addAll(generateOctal(n,ds+i));
        }
        return octal;
    }
}
