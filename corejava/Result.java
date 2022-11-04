package com.corejava;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        int f, s, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks ");
        f = sc.nextInt();
        s = sc.nextInt();
        t = sc.nextInt();
        if (f > 60 && s > 60 && t > 60) {
            System.out.println("Passed");
        } else if ((f > 60 && s > 60) || (f > 60 && t > 60) || (s > 60 && t > 60)) {
            System.out.println("Promoted");
        } else {
            System.out.println("Failed");
        }

    }
}

