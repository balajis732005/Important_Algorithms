package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_HexaDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a limit : ");
        int n = in.nextInt();
        List<String> hexaDecimal = generateHexaDecimal(n,"");
        System.out.println(hexaDecimal);
    }
    public static List<String> generateHexaDecimal(int n, String ds) {
        List<String> hexaDecimal = new ArrayList<>();
        if(ds.length()==n){
            hexaDecimal.add(ds);
            return hexaDecimal;
        }
        for(char i='0';i<='9';i++){
            hexaDecimal.addAll(generateHexaDecimal(n,ds+i));
        }
        for(char i='A';i<='F';i++){
            hexaDecimal.addAll(generateHexaDecimal(n,ds+i));
        }
        return hexaDecimal;
    }
}
