package pokemons;

import moves.Physical.HammerArm;
import moves.Special.FlashCannon;
import moves.Special.Thunder;
import moves.Status.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Regice extends Pokemon {
    public Regice(String name, int level) {

        super(name, level);
        super.setStats(80, 50, 100, 100, 200, 50);
        super.setType(Type.ICE);

        setMove(new HammerArm(), new FlashCannon(), new Thunder(), new ThunderWave());
    }
}
