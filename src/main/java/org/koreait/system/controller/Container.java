package org.koreait.system.controller;

import java.util.Scanner;

public class Container {
    static Scanner sc;

    public static void init(){
        sc = new Scanner(System.in);
    }

    public static void close(){
        sc.close();
    }

    public static Scanner getScanner(){
        return sc;
    }
}
