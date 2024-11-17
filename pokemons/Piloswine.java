package pokemons;

import moves.Status.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Piloswine extends Pokemon {
    public Piloswine (String name, int level) {

        super(name, level);
        super.setStats(100, 100, 80, 60, 60, 50);
        super.setType(Type.ICE, Type.GROUND);

        setMove(new DoubleTeam(), new Confide(), new Amnesia());
    }
}
