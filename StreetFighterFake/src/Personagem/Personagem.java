package Personagem;

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
