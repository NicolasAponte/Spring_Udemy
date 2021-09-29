package co.com.gm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Se crea el proyecto con la instalación de las dependencias:
    - Lombok: Ayuda a evitar la repetición de código, permite enviar data al log.
    - Thymeleaf: Definir plantillas(templates), se acopla my bien a MVC.
    - Web/Validation: LiveReload
*/


@SpringBootApplication
public class HolaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}
}
