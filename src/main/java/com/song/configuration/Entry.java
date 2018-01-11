package com.song.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动入口，配置包根路径
 * <p>
 * 到这一步就可以删掉官方示例给出的SampleController.java了，
 * 由于我们的工程结构已经发生了改变，我们需要告诉SpringBoot框架去扫描哪些包从而加载对应类，
 * 所以这里重新编写main函数。（其中@SpringBootApplication是一个复合注解，就理解为自动配置吧）
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/11/0011
 * Time: 14:10
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.song")
public class Entry {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }
}
