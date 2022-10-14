package lotr;

public class Hobbit extends Character {
    public Hobbit(){
        super(3, 0);
    }
    private void toCry(){
        System.out.println("Hobbit: please don't touch me, I'm just a weak creature");
    }
    @Override
    public void kick(Character c){
        toCry();
        super.kick(c);
    }
}
