package br.com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moises.macero
 */
@RestController
@RequestMapping("/hola")
public final class HolaController {

    @GetMapping
    public String dimeHola(){
        String message = "Hola Amigo!";
        return message;
    }
}
