package com.devd.microservices.springmicroservicestask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringMicroservicesTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesTaskApplication.class, args);
    }

    @Bean
    public TollProcessingTask tollProcessingTask(){
        return new TollProcessingTask();
    }

    public class TollProcessingTask implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            if (null != args) {
                System.out.println("parameters length is :"+args.length);

                String stationId = args[0];
                String licensePlate = args[1];
                String timeStamp = args[2];

                System.out.println("stationId : "+stationId);
                System.out.println("licensePlate : "+licensePlate);
                System.out.println("timeStamp : "+timeStamp);
            }
        }
    }
}
