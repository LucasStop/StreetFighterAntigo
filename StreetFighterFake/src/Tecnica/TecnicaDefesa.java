package Tecnica;

import Personagem.Personagem;

public class TecnicaDefesa extends Tecnica {
    private int defeseBoost;

    public TecnicaDefesa(String name, int power, int energyCost, String type, int cooldown, String description) {
        super(name, power, energyCost, type, cooldown, description);
    }

    public int getDefeseBoost() {
        return defeseBoost;
    }

    @Override
    public void applyEffect(Personagem target) {
        System.out.println(getName() + " ativou uma defesa!");
        // Implementar lógica de defesa (por exemplo, aumentar a defesa do alvo)
    }
}
