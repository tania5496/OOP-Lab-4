public abstract class Character {
    private int power;
    private int hp;
    public void setHp(int newHp){
        this.hp = newHp;
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
    abstract public void kick(Character c);
}
