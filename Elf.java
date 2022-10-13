public class Elf extends Character{
    static int power = 10;
    static int hp = 10;
    @Override
    public void kick(Character c){
        if (this.getPower() > c.getHp()){
            c.setHp(c.getPower() - 1);
        }
        else{
            c.setPower(c.getPower()-1);
        }
    }
}
