package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by jt on 5/24/17.
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}