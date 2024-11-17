import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {

        Battle b = new Battle();

        Cradily cradily = new Cradily("Cradily", 1);
        Lileep lileep = new Lileep("Lileep", 1);
        Mamoswine mamoswine = new Mamoswine("Mamoswine", 1);
        Piloswine piloswine = new Piloswine("Piloswine", 1);
        Regice regice = new Regice("Regice", 1);
        Swinub swinub = new Swinub("Swinub", 1);

        b.addAlly(cradily);
        b.addAlly(lileep);
        b.addAlly(mamoswine);

        b.addFoe(piloswine);
        b.addFoe(regice);
        b.addFoe(swinub);

        b.go();
        }
    }