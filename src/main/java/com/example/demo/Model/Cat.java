package com.example.demo.Model;

public class Cat {

    private String name;
    private String color;
    private int age;
    private int numberOfLifeLeft;
    private int catId;

    public Cat() {
    }

    public Cat(String name, String color, int age, int numberOfLifeLeft) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.numberOfLifeLeft = numberOfLifeLeft;
    }

    public Cat(String name, String color, int age, int numberOfLifeLeft, int catId) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.numberOfLifeLeft = numberOfLifeLeft;
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLifeLeft() {
        return numberOfLifeLeft;
    }

    public void setNumberOfLifeLeft(int numberOfLifeLeft) {
        this.numberOfLifeLeft = numberOfLifeLeft;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", numberOfLifeLeft=" + numberOfLifeLeft +
                ", catId=" + catId +
                '}';
    }
}
