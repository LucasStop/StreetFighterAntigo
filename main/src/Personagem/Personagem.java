package Personagem;

import java.util.ArrayList;

public class Personagem {
    private String name;
    private int age;
    private int strength;
    private int speed;
    private int life;
    private int maxLife; // New attribute to set a max life
    private int level;
    private ArrayList<Tecnica.Tecnica> techniques;

    public Personagem(String name, int age, int strength, int speed, int life, int level) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.speed = speed;
        this.life = life;
        this.maxLife = life; // Initialize max life to initial life value
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
        if (damage < 0) return; // Ignore negative damage values
        this.life -= damage;
        if (this.life < 0) this.life = 0; // Ensure life doesn't go below 0
    }

    public void heal(int heal) {
        if (heal < 0) return; // Ignore negative healing values
        this.life += heal;
        if (this.life > this.maxLife) this.life = this.maxLife; // Ensure life doesn't exceed maxLife
    }

    public void levelUp() {
        this.level++;
        // Optionally, increase stats with each level-up
        this.strength += 2; // Example increment for strength
        this.speed += 1; // Example increment for speed
        this.maxLife += 5; // Increase max life with level
        this.life = this.maxLife; // Heal to max life on level-up
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
