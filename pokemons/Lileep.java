package pokemons;

import moves.Physical.Astonish;
import moves.Status.ConfuseRay;
import moves.Status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lileep extends Pokemon {
    public Lileep (String name, int level) {

        super(name, level);
        super.setStats(66, 41, 77, 61, 87, 23);
        super.setType(Type.ROCK, Type.GRASS);

        setMove(new SwordsDance(), new Astonish(), new ConfuseRay());
    }
}
