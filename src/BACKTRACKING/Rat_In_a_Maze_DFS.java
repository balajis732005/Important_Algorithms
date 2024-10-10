package BACKTRACKING;

import java.util.Scanner;

public class Rat_In_a_Maze_DFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row && column : ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] maz = new int[n][m];
        System.out.println("Enter a maz : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maz[i][j] = in.nextInt();
            }
        }
        int[][] path = new int[n][m];
        if(findMazPath(maz,path,0,0,n,m)){
            System.out.println("Path : ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("There is no path exists");
        }
    }
    public static boolean findMazPath(int[][] maz,int[][] path,int i,int j,int n,int m){
        if(i==n-1 && j==m-1 && maz[i][j]==1){
            path[i][j]=1;
            return true;
        }
        if(isValidPath(maz,path,i,j,n,m)){
            path[i][j]=1;
            if(findMazPath(maz,path,i+1,j,n,m)){
                return true;
            }
            if(findMazPath(maz,path,i,j+1,n,m)){
                return true;
            }
            if(findMazPath(maz,path,i-1,j,n,m)){
                return true;
            }
            if(findMazPath(maz,path,i,j-1,n,m)){
                return true;
            }
            path[i][j]=0;
        }
        return false;
    }
    public static boolean isValidPath(int[][] maz,int[][] path,int i,int j,int n,int m){
        return i<n && i>=0 && j<m && j>=0 && maz[i][j]==1 && path[i][j]==0;
    }
}
