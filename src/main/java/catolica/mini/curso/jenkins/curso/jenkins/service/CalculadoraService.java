package catolica.mini.curso.jenkins.curso.jenkins.service;

import org.springframework.stereotype.Service;

@Service

public class CalculadoraService {
    public static String hello(){
        return "Bem vindo";
    }
    public static int somar(int a, int b){
        return a+b;
    }
    public static int subtrair(int a, int b){
        return a-b;
    }
}
