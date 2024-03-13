package sdu.bigdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableAsync
@EnableScheduling
public class DGApplication {
    public static void main(String[] args) {
        SpringApplication.run(DGApplication.class, args);
    }
}
