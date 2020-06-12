package com.example.demo.controller;

import java.util.Scanner;

/**
 * @Author jtt
 * @Date 2020/6/12 - 06 - 12 - 8:45
 * @Description
 */
public class Split {
    public void test2() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        System.out.println(split[split.length-1].length());
    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String s="";
//        while(input.hasNextLine()){
//            s=input.nextLine();
//            System.out.println(s.length()-1-s.lastIndexOf(" "));
//        }
//    }


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String s="";
//        while(input.hasNextLine()){
//            s=input.nextLine();
//            String[] split = s.split(" ");
//            int n =split[split.length-1].length();
//            System.out.println(n);
//        }
//    }
}
