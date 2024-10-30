package Personagem;

public class PersonagemNinja extends Personagem {
    private int agility;

    public PersonagemNinja(String name, int age, int strength, int speed, int life, int level, int agility) {
        super(name, age, strength, speed, life, level);
        this.agility = agility;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public void applyDamage(int damage) {
        super.applyDamage(damage - agility);
    }

    @Override
    public void heal(int heal) {
        super.heal(heal + agility);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        agility += 5;
    }
}

