package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(@RequestParam(name="name", required=false, defaultValue="Home") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @GetMapping("/error")
    public String error(@RequestParam(name="name", required=false, defaultValue="Error") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
