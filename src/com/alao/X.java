package com.alao;

import java.util.Scanner;

public class X {
    private final int x;

//    public X(int x) {
//        this.x = x;
//    }
    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x() {
        for (int x=0; x<13; x++) {
            System.out.println(this.x + " * " + x + " = " + this.x * x);
        }
    }
    public void x1() {
        for (int x1 = 0; x1 < 13; x1++) {
            System.out.println(this.x + " * " + x1 + " = " + this.x * x1);
        }
    }
}
