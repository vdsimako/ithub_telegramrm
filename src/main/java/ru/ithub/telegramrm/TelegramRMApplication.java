package ru.ithub.telegramrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class TelegramRMApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegramRMApplication.class, args);
    }

}
