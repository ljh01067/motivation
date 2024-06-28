package org.koreait.system;


import org.koreait.motivation.controller.MotivationController;
import org.koreait.motivation.entity.Motivation;
import org.koreait.system.controller.Container;
import org.koreait.system.controller.SystemController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

    public App() {

    }
    public void run() {
        System.out.println("== motivation execution ==");

        SystemController systemController = new SystemController();
        MotivationController motivationController = new MotivationController();

        while (true) {
            System.out.print("command) ");
            String cmd = Container.getScanner().nextLine().trim();
            if (cmd.equals("exit")) {
                systemController.exit();
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어 입력해");
                continue;
            }
            if (cmd.equals("add")) {
               motivationController.add();
            } else if (cmd.equals("list")) {
                motivationController.list();
            } else if (cmd.equals("delete")) {
                motivationController.delete();
            }
            else{
                System.out.println("사용할 수 없는 명령어입니다.");
            }
        }
    }
}
