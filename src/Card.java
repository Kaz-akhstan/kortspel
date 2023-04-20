import java.util.Random;

public abstract class Card {
    int health;
    int minDmg;
    int maxDmg;
    int def;
    int acc;
    int lvl;
    int spd;
    String name;

    public String playAgainst(Card other)
    {
        Random rn = new Random();

        if(spd > other.spd)
        {
            other.health -= rn.nextInt(maxDmg-minDmg) + minDmg;
        }

        if(other.health == health)
        {
            return "Victory";
        }
        return "";
    }
}
