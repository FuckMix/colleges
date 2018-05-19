package cn.edu.zjut.colleges;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CollegesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollegesApplication.class, args);
    }
}
