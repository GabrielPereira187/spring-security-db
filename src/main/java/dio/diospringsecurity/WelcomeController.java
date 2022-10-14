package dio.diospringsecurity;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to application";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String users(){
        return "Authorized";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasAnyRole('MANAGERS')")
    public String manager(){
        return "Authorized manager";
    }


}
