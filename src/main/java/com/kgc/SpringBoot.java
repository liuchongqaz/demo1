package com.kgc;/*
@author liu Chong
@date
@version
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//声明该类是springboot的引导类
@SpringBootApplication
public class SpringBoot {
    public static void main(String[] args) {
        //springboot的引导类 参数就是类名.class
        SpringApplication.run(SpringBoot.class);
    }
}
