package com.example.demo.Service;

import com.example.demo.Model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatService {

    List cats = new ArrayList<>();

    public CatService() {
        cats.add(new Cat("Tom", "Blå", 12, 9, 1));
        cats.add(new Cat("Bob", "Sort", 1, 6, 2));
        cats.add(new Cat("Lars", "Prikket", 5, 7, 3));
        cats.add(new Cat("Thomas", "Stribet", 14, 1, 4));
        cats.add(new Cat("Kim", "Hvid", 2, 4, 5));
        cats.add(new Cat("Pelse", "Brun", 9, 3, 6));
        cats.add(new Cat("Torben", "Rød", 4, 2, 7));
    }

    public void findCatById(int catId){
        return ;
    }

    public void deleteCat(int catId){

    }

    public void createCat(String name, String color, int age, int numberOfLifesLeft){

    }

    public void giveLife(int catId){

    }

    public void takeLife(int catId){

    }

    public List<Cat> getAllCats(){
        return cats;

    }
}
