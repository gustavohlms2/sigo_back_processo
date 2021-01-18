package br.com.springprocesso.pucsigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.springprocesso.pucsigo")
@EntityScan(basePackages = "br.com.springprocesso.pucsigo.model")
public class PucSigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PucSigoApplication.class, args);
	}

}

