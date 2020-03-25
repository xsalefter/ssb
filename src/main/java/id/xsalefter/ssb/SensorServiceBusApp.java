package id.xsalefter.ssb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SensorServiceBusApp {
    public static void main(String[] args) {
        SpringApplication.run(SensorServiceBusApp.class, args);
    }
}
