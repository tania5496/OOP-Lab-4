public class Hobbit extends Character{
    static int power = 0;
    static int hp = 3;
    @Override
    public void kick(Character c){
        toCry();
    }
    private void toCry(){
        System.out.println("Go away or I'll cry!!!!");
    }
}
