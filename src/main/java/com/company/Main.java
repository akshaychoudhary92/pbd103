package com.company;

public class Main {
    int squares = 81;
    public static void main(String[] args) {

       new Main().go();
    }
    void go(){
        incr(squares* = 1);
        System.out.println(squares);
    }
    void incr(int a){
        squares = a + 10;
    }
}
