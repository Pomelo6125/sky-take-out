package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Scanner;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
public class SkyApplication {
    public static void main(String[] args) {
        //保存 spring boot 生成的context 对象
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SkyApplication.class, args);

        // 生成获取控制台输入信息对象
        Scanner scanner = new Scanner(System.in);

        // 循环
        while(true){
            //获取控制台输入，如果没有会被阻塞
            String in = scanner.nextLine();
            //如果输入 q表示退出程序
            if(in.equals("q")){
                break;
            }
        }
        // 退出 spring boot
        SpringApplication.exit(applicationContext);
    }
}
