package com.camaratek.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.camaratek.batch"})
public class ReadCsvFromSpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadCsvFromSpringBatchApplication.class, args);
	}

}
