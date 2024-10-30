package Personagem;

import java.util.ArrayList;

public class Personagem {
    private String name;
    private int age;
    private int strength;
    private int speed;
    private int life;
    private int level;
    private ArrayList<Tecnica.Tecnica> techniques;

    public Personagem(String name, int age, int strength, int speed, int life, int level) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.speed = speed;
        this.life = life;
        this.level = level;
        this.techniques = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getLife() {
        return this.life;
    }

    public int getLevel() {
        return this.level;
    }

    public ArrayList<Tecnica.Tecnica> getTechniques() {
        return this.techniques;
    }

    public void applyDamage(int damage) {
        this.life -= damage;
    }

    public void heal(int heal) {
        this.life += heal;
    }

    public void levelUp() {
        this.level++;
    }

    public void addTechnique(Tecnica.Tecnica technique) {
        this.techniques.add(technique);
    }
}