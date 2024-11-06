package Personagem;

import Tecnica.Tecnica;

import java.util.ArrayList;

public class Personagem {
    private String name;
    private int age;
    private int strength;
    private int speed;
    private int life;
    private int maxLife;
    private int level;
    private ArrayList<Tecnica.Tecnica> techniques;

    public Personagem(String name, int age, int strength, int speed, int life, int level) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.speed = speed;
        this.life = life;
        this.maxLife = life;
        this.level = level;
        this.techniques = new ArrayList<>();
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {

        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLife() {

        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return this.maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getLevel() {

        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<Tecnica.Tecnica> getTechniques() {

        return this.techniques;
    }

    public void setTechniques(ArrayList<Tecnica.Tecnica> techniques) {
        this.techniques = techniques;
    }

    public void applyDamage(int damage) {
        if (damage < 0) return;
        this.life -= damage;
        if (this.life < 0) this.life = 0;
    }

    public void heal(int heal) {
        if (heal < 0) return;
        this.life += heal;
        if (this.life > this.maxLife) this.life = this.maxLife;
    }

    public void levelUp() {
        this.level++;
        this.strength += 2;
        this.speed += 1;
        this.maxLife += 5;
        this.life = this.maxLife;
    }

    public void addTechnique(Tecnica.Tecnica technique) {
        this.techniques.add(technique);
    }

    public void removeTechnique(Tecnica.Tecnica technique) {
        this.techniques.remove(technique);
    }

    public void displayStatus() {
        System.out.println("Character Status:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Strength: " + this.strength);
        System.out.println("Speed: " + this.speed);
        System.out.println("Life: " + this.life + "/" + this.maxLife);
        System.out.println("Level: " + this.level);
        System.out.println("Techniques: " + this.techniques.size() + " techniques");
    }
}
