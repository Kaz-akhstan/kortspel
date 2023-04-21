public class Model {
    public static void main(String[] args) {
        Knight k1 = new Knight();
        Archer k2 = new Archer();

        while (k1.health > 0 && k2.health > 0)
        {
            if(k1.spd < k2.spd)
            {
                System.out.println(k2.playAgainst(k1));
                if(k1.health > 0)
                {
                    System.out.println(k1.playAgainst(k2));
                }
            }
            else {
                System.out.println(k1.playAgainst(k2));
                if(k2.health > 0)
                {
                    System.out.println(k2.playAgainst(k1));
                }
            }
        }
    }
}
