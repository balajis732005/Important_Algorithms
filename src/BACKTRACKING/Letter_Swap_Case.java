package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Letter_Swap_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = in.nextLine();
        List<String> pass = passwordCheck(new StringBuilder(str),0);
        System.out.println(pass);
    }
    public static List<String> passwordCheck(StringBuilder password,int ind){
        List<String> passCh = new ArrayList<>();
        if(ind == password.length()){
            passCh.add(password.toString());
            return passCh;
        }
        if(Character.isAlphabetic(password.charAt(ind))){
            password.replace(ind,ind+1,Character.toLowerCase(password.charAt(ind))+"");
            passCh.addAll(passwordCheck(password,ind+1));
            password.replace(ind,ind+1,Character.toUpperCase(password.charAt(ind))+"");
            passCh.addAll(passwordCheck(password,ind+1));
        }else{
            passCh.addAll(passwordCheck(password,ind+1));
        }
        return passCh;
    }
}
