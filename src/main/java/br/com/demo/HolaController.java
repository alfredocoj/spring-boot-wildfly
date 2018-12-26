package br.com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alfredocoj
 */
@RestController
@RequestMapping("/")
public final class HolaController {

    @GetMapping
    public String dimeHola(){
        String message = "Microservice Grupo Mateus - It Happens!";
        return message;
    }
}
