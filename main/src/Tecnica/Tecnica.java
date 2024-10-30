package Tecnica;

import Personagem.Personagem;

public class Tecnica {
    private String name;
    private int power;
    private int energyCost;
    private String type;
    private int cooldown;
    private String description;

    public Tecnica(String name, int power, int energyCost, String type, int cooldown, String description) {
        this.name = name;
        this.power = power;
        this.energyCost = energyCost;
        this.type = type;
        this.cooldown = cooldown;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public String getType() {
        return type;
    }

    public int getCooldown() {
        return cooldown;
    }

    public String getDescription() {
        return description;
    }

    public void applyEffect(Personagem target) {
        System.out.println(getName() + " ativou uma técnica!");
    }
}
