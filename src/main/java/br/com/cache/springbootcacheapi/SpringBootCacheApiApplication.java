package br.com.cache.springbootcacheapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching //ativa o cache do springboot
public class SpringBootCacheApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheApiApplication.class, args);
	}

}
