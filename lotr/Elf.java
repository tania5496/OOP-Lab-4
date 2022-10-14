package lotr;

public class Elf extends Character {
    public Elf(){
        super(10, 10);
    }
    @Override
    public void kick(Character c){
        super.kick(c);
        if (this.getPower() <= c.getHp()) {
            c.setPower(c.getPower() - 1);
        }
    }
}
