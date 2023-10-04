package kz.dar.academy.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@SpringBootApplication
public class ClientPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientPaymentApplication.class, args);
	}

}
