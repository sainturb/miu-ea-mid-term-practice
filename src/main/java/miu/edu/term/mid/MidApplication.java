package miu.edu.term.mid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MidApplication {

	public static void main(String[] args) {
		SpringApplication.run(MidApplication.class, args);
	}


	@Bean
	RestTemplate setup() {
		return new RestTemplate();
	}
}
