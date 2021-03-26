package com.meli.clase1.Controller;


import com.Entities.ConversorNumero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Romano {
    @GetMapping("/romanos/{numero}")
    public String conversorNumero(@PathVariable(value = "numero") int numero){

    return ConversorNumero.conversor(numero);

    }
}
