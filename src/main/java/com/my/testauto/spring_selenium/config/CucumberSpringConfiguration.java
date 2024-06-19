package com.my.testauto.spring_selenium.config;


import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

import lombok.SneakyThrows;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@Primary
@ComponentScan("com.my.testauto.spring_selenium")
@CucumberContextConfiguration
@SpringBootTest(classes = CucumberSpringConfiguration.class)
public class CucumberSpringConfiguration {

	@Before
	public void setup(){
		System.out.println("Start.......");
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
	}

	class MyThread extends Thread{
		@SneakyThrows
		public void run(){
			System.out.println("Report Generation");
		}
	}


}
