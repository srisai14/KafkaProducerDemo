package com.srisai.KafkaProducerDemo;

import com.srisai.KafkaProducerDemo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Source.class, Sink.class})
public class KafkaProducerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerDemoApplication.class, args);
	}

//	@StreamListener("input")
//	public void consumeMessage(Employee employee) {
//		System.out.println("*****************   "+employee);
//	}

}
