package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==motivation 실행==");
        while(true) {
            System.out.println("명령어 : ");
            Scanner 명령어 = new Scanner(System.in);
            String a = 명령어.next();
            if (a.equals("등록")){
                등록 등록1 = new 등록();
                등록1.글귀();
            }
            if (a.equals("조회")){
                리스트 리스트1 = new 리스트();
                리스트1.리스트조회();
            }
            else if (a.equals("나가기")) {
                System.out.println("==motivation 종료==");
                break;
            }
        }
    }
}
class 등록{
    public static void 글귀() {
        System.out.println("글귀를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println("작성자를 입력해주세요 : ");
        String b = sc.next();
        리스트 리스트1 = new 리스트();
        리스트1.리스트등록(a,b);
    }
}
class 조회 {

}
class 리스트{
    List<String> list = new ArrayList<>();
    Map<String,String> map = new HashMap<>();
    public String 리스트등록(String a, String b) {
        this.list.add(a);
        this.map.put(a,b);
        System.out.println("글귀 : "+a+"와 작성자 : "+b+"가 리스트에 등록되었습니다.");
        return "리스트에 등록되었습니다.";
    }
    void 리스트조회(){
        for(int i = 0;i < this.list.size();i++) {
            System.out.println("글귀 : "+this.list.get(i)+", 작성자 : "+this.map.get(this.list.get(i)));
        }
    }
}