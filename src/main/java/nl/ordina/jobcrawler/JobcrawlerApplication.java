package nl.ordina.jobcrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobcrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobcrawlerApplication.class, args);
	}

}
