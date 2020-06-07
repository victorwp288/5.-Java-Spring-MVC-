package com.example.demo.Controller;

import com.example.demo.Model.Cat;
import com.example.demo.Service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CatService catService;

    public String index(Model model){
        List<Cat> cats = catService.getAllCats();
        model.addAttribute("cats", cats);
        return "index";
    }


}
