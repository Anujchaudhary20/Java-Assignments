package com.oops;

public class Singletone {
    private static Singletone singletone = new Singletone();
    public static Singletone getInstance(){
        return singletone;
    }
    private Singletone(){}
    protected void show(){
        System.out.println("This is a Singletone Class. only one instance is created at a time.");
    }

    public static void main(String[] args) {
        Singletone obj = Singletone.getInstance();
            obj.show();
    }
}