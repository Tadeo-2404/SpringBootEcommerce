package SpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Spring Boot App!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world";
    }
}
