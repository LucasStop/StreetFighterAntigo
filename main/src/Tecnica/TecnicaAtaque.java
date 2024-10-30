package Tecnica;

import Personagem.Personagem;

public class TecnicaAtaque extends Tecnica {
    public TecnicaAtaque(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.Ataque", cooldown, "Dano");
    }

    @Override
    public void applyEffect(Personagem target) {
        super.applyEffect(target);
        System.out.println(getName() + " causou " + getPower() + " de dano!");
    }
}