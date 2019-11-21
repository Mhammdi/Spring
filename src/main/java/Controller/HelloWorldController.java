/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.HelloWorld;
/**
 *
 * @author khali
 */
@Controller
public class HelloWorldController {
    
@RequestMapping("/helloworld")
public String affichage_world(Model model) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
        model.addAttribute("helloWorld", helloWorld);
        System.out.println("****************************");
        return "helloworld";
}
    
}
