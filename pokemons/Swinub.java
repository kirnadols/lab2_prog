package pokemons;

import moves.Status.Confide;
import moves.Status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name, int level) {

        super(name, level);
        super.setStats(50, 50, 40, 30, 30, 50);
        super.setType(Type.ICE, Type.GROUND);

        setMove(new DoubleTeam(), new Confide());
    }
}
