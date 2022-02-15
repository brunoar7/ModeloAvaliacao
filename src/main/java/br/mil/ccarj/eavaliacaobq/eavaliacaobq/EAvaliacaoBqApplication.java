package br.mil.ccarj.eavaliacaobq.eavaliacaobq;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EAvaliacaoBqApplication {

	public static void main(String[] args) {
		SpringApplication.run(EAvaliacaoBqApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
