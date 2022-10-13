import java.util.Random;
public class Knight extends Character{
    Random rand = new Random();
    private int power = rand.nextInt(2,13);
    private int hp = rand.nextInt(2, 13);
    @Override
    public void kick(Character c) {
        int decreaseHp = rand.nextInt(c.getHp() + 1);
        c.setHp(c.getHp() - decreaseHp);
    }
}
