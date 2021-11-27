package lab.five.client.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5RibbonUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5RibbonUserApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		
		return new RestTemplate();
	}
}
