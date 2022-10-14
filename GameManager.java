import lotr.Character;

public class GameManager{
    void fight (Character c1, Character c2){
        int power1 = c1.getPower();
        int power2 = c2.getPower();
        int hp1 = c1.getHp();
        int hp2 = c2.getHp();
        String name1 = c1.getClass().getSimpleName().toLowerCase();
        String name2 = c2.getClass().getSimpleName().toLowerCase();

        System.out.println(name1 +"(hp:"+hp1+", power:"+power1+")" +" vs "+name2 +"(hp:"+hp2+", power:"+power2+")");
        if (c1.getPower() == 0 && c2.getPower() == 0){
            System.out.println("They are both weak, a DRAW");
        }
        else {
            while (c1.isAlive() && c2.isAlive()) {
                c1.kick(c2);
                if (c2.isAlive()) {
                    c2.kick(c1);
                }
                System.out.println("Results of battle:");
                System.out.println(name1 + "(hp:" + c1.getHp() + ", power:" + c1.getPower() + ")" + " | " + name2 + "(hp:" + c2.getHp() + ", power:" + c2.getPower() + ")");
                System.out.println("");
            }
            if (c1.isAlive()) {
                System.out.println(name1 + " is the winner!");
            }
            else {
                System.out.println("");
                System.out.println(name2 + " is the winner!");
            }
        }
    }
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        CharacterFactory characterFactory= new CharacterFactory();
        GameManager gameManager = new GameManager();
        gameManager.fight(characterFactory.createCharacter(), characterFactory.createCharacter());
    }
}
