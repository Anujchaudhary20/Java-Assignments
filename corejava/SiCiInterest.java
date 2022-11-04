package com.corejava;
import java.util.Scanner;

public class SiCiInterest {
    public static void main(String[] args) {
        float p, r, t, si, ci;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the p,r,t");
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();
        si = (p * r * t) / 100;
        ci = (float) (p * (Math.pow((1+r/100),t)));
        System.out.println("Simple Imtrest is and compound"  + si);
        System.out.println("Compound Imtrest is and compound"  + ci);
    }
}