package dan.nov17.santander_project_desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//para corrigir o problema de cors acrecentando a @openApidefinition
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class SantanderProjectDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderProjectDesafioApplication.class, args);
	}

}
