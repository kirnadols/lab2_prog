package moves.Special;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {

    public Thunder () {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3) {
            Effect.paralyze(pokemon);
        }
    }
    @Override
    protected String describe() {
        return "делает ход Thunder";
    }
}
