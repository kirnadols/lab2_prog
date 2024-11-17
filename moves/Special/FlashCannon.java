package moves.Special;

import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove {

    public FlashCannon() {
        super(Type.STEEL, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
       if (Math.random() < 0.1) {
           pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
       }
    }

    @Override
    protected String describe() {
        return "делает ход FlashCannon";
    }
}
