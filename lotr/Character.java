package lotr;

public abstract class Character {
    public Character(int newHp, int newPower){
        setHp(newHp);
        this.power = newPower;
    }
    private int power;
    private int hp;
    public void setHp(int newHp){
        if (newHp>0) {
            this.hp = newHp;
        }
        else{
            this.hp = 0;
        }
    }
    public Integer getHp(){
        return hp;
    }

    public void setPower(int newPower){
        this.power = newPower;
    }
    public Integer getPower(){
        return power;
    }

    public Boolean isAlive(){
        if (this.getHp() < 0){
            return Boolean.FALSE;
        }
        else{
            return Boolean.TRUE;
        }
    }
    public String toString(){
        return this.getClass().getSimpleName() + "{hp="+this.getHp() +", power="+this.getPower()+"}";
    }
    public void kick(Character c){
        this.setHp(c.getHp() - this.getPower());
    }
}


