package rf.com.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import rf.com.tienda.dominio.Categoria;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TiendaSpringRsf2023Application {

	public static void main(String[] args) {
		SpringApplication.run(TiendaSpringRsf2023Application.class, args);
	}

}
