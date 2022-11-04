package com.string;
public class Operations {
    public static void main(String[] args) {
        String str="Java String pool refer to the collection of string which are stored in heap memory";
        String str1="java string pool refer to the collection of string which are stored in heap memory";
        System.out.println(str);
        String s1=str.toLowerCase();
        System.out.println("Strings in lower case:" +s1);
        String s2=str.toUpperCase();
        System.out.println("Strings in Upper case:" +s2);
        String s3=str.replace('a','$');
        System.out.println("Strings after replacements:" +s3);
        System.out.println("Strings contains collection word or not: " +str.contains("collection"));
        if(str==str1)
        {System.out.println("Matches original string");}
        else
        {System.out.println(" not Matches original string");}
        if(str.equals( str1))
        {System.out.println("Matches original string");}
        else
        {System.out.println(" not Matches original string");}
    }
}