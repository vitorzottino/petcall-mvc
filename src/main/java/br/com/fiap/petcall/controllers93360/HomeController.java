package br.com.fiap.petcall.controllers93360;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("msg", "Bem-vindo(a) ao PetCall Center");
        return "/petcall/index";
    }
}
