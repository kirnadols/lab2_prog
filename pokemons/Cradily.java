package pokemons;

import moves.Physical.Astonish;
import moves.Physical.Bulldoze;
import moves.Status.ConfuseRay;
import moves.Status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cradily extends Pokemon {
    public Cradily(String name, int level) {

        super(name, level);
        super.setStats(86, 81, 97, 81, 107, 43);
        super.setType(Type.ROCK, Type.GRASS);

        setMove(new SwordsDance(), new Astonish(), new ConfuseRay(), new Bulldoze());
    }
}

