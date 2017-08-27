package org.fyh.spirngdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("org.fyh.spirngdemo2.mapper")
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
    
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
