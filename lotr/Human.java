package lotr;

import java.util.Random;

public abstract class Human extends Character {
    private static Random random = new Random();
    public Human(int min, int max) {
        super(random.nextInt(max - min) + min, random.nextInt(max - min) + min);
    }
    @Override
    public void kick(Character c){
        int randNum = random.nextInt(this.getPower());
        c.setHp(c.getHp() - randNum);
    }
}