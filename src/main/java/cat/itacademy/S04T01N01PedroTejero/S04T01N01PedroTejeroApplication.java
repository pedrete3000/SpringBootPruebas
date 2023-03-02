package cat.itacademy.S04T01N01PedroTejero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@RestController
@SpringBootConfiguration
@ComponentScan
@Configuration
public class S04T01N01PedroTejeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N01PedroTejeroApplication.class, args);
	}

	/* @GetMapping("/")
	    public String saluda(@RequestParam(value = "name", defaultValue = "unknown") String name) {
	      return String.format("Hello %s! estás ejecutando un proyecto Maven", name);
	    }*/
}
