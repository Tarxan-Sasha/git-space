package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping("/hello")
	public String display() {
		return "Sasha";
	}
@RequestMapping("/Sasha")  
	public String display1()  {  
	    return "Sasha";  
	}  

@RequestMapping("/Alina")  
	public String Alina()  {  
	    return "Alina";  
	}  
@RequestMapping("/TEST")
	public String Test() {
		return "TEST";
	}
}
