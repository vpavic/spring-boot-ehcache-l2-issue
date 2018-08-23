package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootEhcacheL2IssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEhcacheL2IssueApplication.class, args);
	}

}
