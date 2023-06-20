package com.snake_ladder;

public class Constructor {
    int a=4 ;
    int b=5;
    public Constructor(){
        a=a;
        b=b;
        int z = a+b;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
    }
}
