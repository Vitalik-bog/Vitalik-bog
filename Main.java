package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи что нибудь уже");
        String.word = in.nextLine();
        StringBuffer str = new StringBuffer(word);
        StringBuffer rts = new StringBuffer(str);
        rts.reverse();
        System.out.println(str.compareTo(rts));
    }
}