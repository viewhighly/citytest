package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cq on 6/3/15.
 */
@RestController
public class GreetingsController {

    @RequestMapping("/")
    public String index() {
        return "Greetings Beijing Roadshow! 2015!";
    }
}
