package pokemons;

import moves.Physical.DoubleHit;
import moves.Status.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mamoswine extends Pokemon {
    public Mamoswine (String name, int level) {

        super(name, level);
        super.setStats(110, 130, 80, 70, 60, 80);
        super.setType(Type.ICE, Type.GROUND);

        setMove(new DoubleTeam(), new Confide(), new Amnesia(), new DoubleHit());
    }
}
