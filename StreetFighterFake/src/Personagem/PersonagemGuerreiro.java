package Personagem;

public class PersonagemGuerreiro extends Personagem {
    private int armor;

    public PersonagemGuerreiro(String name, int age, int strength, int speed, int life, int level, int armor) {
        super(name, age, strength, speed, life, level);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void applyDamage(int damage) {
        super.applyDamage(damage - armor);
    }

    @Override
    public void heal(int heal) {
        super.heal(heal + armor);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        armor += 5;
    }
}
