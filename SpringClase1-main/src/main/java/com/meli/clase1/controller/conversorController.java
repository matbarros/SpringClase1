package com.meli.clase1.controller;

import com.meli.clase1.entity.ConversorMorse;
import com.meli.clase1.entity.ConversorNumero;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conversorController {

    @GetMapping("/romanos/{numero}")
    public String conversonNumero(@PathVariable(value = "numero") int numero){
        if(numero<=3999){
            return ConversorNumero.conversor(numero);
        }else{
            return "Nùmero supera el maximo permitido";
        }
    }


    @GetMapping("/morse/{codigo}")
    public ResponseEntity<ConversorMorse> conversorMorse(@PathVariable() String codigo){
        ConversorMorse morse = new ConversorMorse();
        morse.setStringCodigo(ConversorMorse.decode(codigo));
        return new ResponseEntity(morse, HttpStatus.ACCEPTED);
    }
}
