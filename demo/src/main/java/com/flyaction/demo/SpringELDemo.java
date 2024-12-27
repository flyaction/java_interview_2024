package com.flyaction.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
public class SpringELDemo {

	public static void main(String[] args) {
		log.info("log:{}","abcd");
		System.out.println();
	}

}
