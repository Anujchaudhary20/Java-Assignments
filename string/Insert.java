package com.string;

public class Insert {
        public static void main(String[] args) {
            StringBuffer sb=new StringBuffer("It is used to  at the specified index position");
            System.out.println("Before insertion:"+sb);
            sb.insert(14,"insert text");
            System.out.println("After insertion:"+sb);
        }
}