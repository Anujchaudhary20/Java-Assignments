package com.string;

public class Buildreverse {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println("Before reverse :"+sb);
        sb.reverse();
        System.out.println("After reverse :"+sb);

    }

}
