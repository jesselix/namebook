package li.jesse.namebookaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class NamebookAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamebookAccountApplication.class, args);
    }

}
