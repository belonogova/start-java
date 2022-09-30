package com.startjava.Lesson_2_3.robot;

public class Jaeger {
    private String name;
    private int lounched;
    private String mark;
    private String origin;
    private int height;
    private double weight;
    private int speed;
    private int armor;

    public Jaeger() {

    }

    public Jaeger(String name) {
        this.name = name;
    }

    public Jaeger(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public Jaeger(String name, String mark, int speed, int armor) {
        this.name = name;
        this.mark = mark;
        this.speed = speed;
        this.armor = armor;
    }

    public Jaeger(String name, String mark, String origin, int height, double weight, int speed, int armor) {
        this.name = name;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLounched() {
        return lounched;
    }

    public void setLounched(int lounched) {
        this.lounched = lounched;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println("Двигаюсь");
    }

    public void destruction() {
        System.out.println("Уничтожаю Кайдзю");
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void selfDestruction() {
        System.out.println("Самоуничтожение");
    }

    public String scanKaiju() {
        return "сканирую...";
    }
}