package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

/**
 * @Author jtt
 * @Date 2020/6/10 - 06 - 10 - 22:58
 * @Description
 */
@Controller
public class LeastCommonMultiple {
    @RequestMapping("/test")
    public void test(){
        System.out.println("请输入第一个正整数A：");
        Scanner input = new Scanner(System.in);
        Integer A = input.nextInt();
        System.out.println("请输入第二个正整数B：");
        Integer B = input.nextInt();
        for (int i = 1; i <= A * B;i++){
            if((i%A==0) && (i%B==0)){
                System.out.println("最小公倍数为："+i);
                break;
            }
        }
    }
}
