package org.koreait.system;

import org.koreait.system.controller.Container;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container.init();
        new App().run();
        Container.close();
    }
}
