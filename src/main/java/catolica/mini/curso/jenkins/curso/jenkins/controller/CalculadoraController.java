package catolica.mini.curso.jenkins.curso.jenkins.controller;

import catolica.mini.curso.jenkins.curso.jenkins.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/Ola")
    public String hello(){
        return CalculadoraService.hello();
    }
    @GetMapping("/somar/(a)/(b)")
    public int somar(@PathVariable int a, @PathVariable int b){
        return CalculadoraService.somar(a,b);
    }
    @GetMapping("/subtrair/(a)/(b)")
    public int subtrair(@PathVariable int a, @PathVariable int b){
        return CalculadoraService.subtrair(a,b);
    }
}
