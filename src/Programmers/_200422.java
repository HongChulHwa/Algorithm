package Programmers;

import java.util.Scanner;

public class _200422 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int j=1; j<=b; j++){

            if(j!=1){
                System.out.println("");
            }
            for(int i =1; i<=a; i++){

                System.out.print("*");

            }

        }

    }
}