import java.util.Random;
public class King extends Character {
    Random rand = new Random();
    private int power = rand.nextInt(5, 16);
    private int hp = rand.nextInt(5, 16);

    @Override
    public void kick(Character c) {
        int decreaseHp = rand.nextInt(c.getHp() + 1);
        c.setHp(c.getHp() - decreaseHp);
    }
}
