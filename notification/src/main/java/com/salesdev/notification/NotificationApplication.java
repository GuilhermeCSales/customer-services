package com.salesdev.notification;

import com.salesdev.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "com.salesdev.notification",
                "com.salesdev.amqp"
        }
)
@EnableEurekaClient
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationConfig notificationConfig
//    ) {
//        return args -> {
//            producer.publish(
//                    new Person("John Doe", 20),
//                    notificationConfig.getInternalExchanges(),
//                    notificationConfig.getInternalNotificationRoutingKey()
//            );
//        };
//    }
//
//    record Person(String name, int age) {
//    }
}
