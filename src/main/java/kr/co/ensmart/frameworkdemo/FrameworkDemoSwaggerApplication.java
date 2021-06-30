package kr.co.ensmart.frameworkdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@MapperScan(basePackages = "kr.co.ensmart.frameworkdemo.app.dao")
public class FrameworkDemoSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkDemoSwaggerApplication.class, args);
	}

}
