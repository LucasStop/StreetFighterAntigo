package Tecnica;

import Personagem.Personagem;

public class TecnicaCura extends Tecnica {
    public TecnicaCura(String name, int power, int energyCost, int cooldown) {
        super(name, power, energyCost, "Tecnica.TecnicaCura", cooldown, "Recuperação");
    }

    @Override
    public void applyEffect(Personagem target) {
        super.applyEffect(target);
        System.out.println(getName() + " curou " + getPower() + " de vida!");
    }
}