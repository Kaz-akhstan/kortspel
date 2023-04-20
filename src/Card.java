public abstract class Card {
    int health;
    int minDmg;
    int maxDmg;
    int def;
    int acc;
    int lvl;
    String name;

    public String playAgainst(Card other)
    {
        if(other.health == health)
        {
            return "Victory";
        }
        return "";
    }
}
