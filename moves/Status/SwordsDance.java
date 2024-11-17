package moves.Status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove {

    public SwordsDance() {
        super(Type.NORMAL, 0,  0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, +2);
    }

    @Override
    protected String describe() {
        return "делает ход SwordsDance";
    }
}