package com.example.demo.Controller;

import com.example.demo.Model.Cat;
import com.example.demo.Service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CatService catService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("cats", catService.getAllCats());
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Cat cat){
        catService.createCat(cat);
        return "redirect:/";
    }


}
