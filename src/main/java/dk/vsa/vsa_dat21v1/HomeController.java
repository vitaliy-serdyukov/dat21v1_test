package dk.vsa.vsa_dat21v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(){
    return "index";
  }

  @GetMapping("/hejhej")
  public String greeting(){
      return "hej";
  }

  @GetMapping("/shout")
  public String great(){
      return "greet";
  }
}
