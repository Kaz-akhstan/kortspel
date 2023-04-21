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
        int dmg = rn.nextInt(maxDmg-minDmg + 1) + minDmg;
        if(rn.nextInt(10) >= other.def && acc >= rn.nextInt(10))
        {
            other.setHealth(other.health - dmg);
            System.out.println("Dealt " + dmg + " damage!");
        }
        if(other.health < 1)
        {
            lvl++;
            return other.name + " took " + dmg + " damage! " + name + " has won!";
        }
        return other.name + " took " + dmg + " damage!";
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
