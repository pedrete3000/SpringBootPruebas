package cat.itacademy.S04T01N01PedroTejero.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	 @GetMapping("/HelloWorld")
	    public String saluda(@RequestParam(value = "name", defaultValue = "unknown") String name) {
	      return String.format("Hello %s! estás ejecutando un proyecto Maven", name);
	    }
	 @GetMapping("/HelloWorld2/{name}")
	    public String saluda2(@PathVariable (required=false) String name) {
	      return String.format("Hello %s! estás ejecutando un proyecto Maven", name);
	    }

	 
}

