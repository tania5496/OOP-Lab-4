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

        while (c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            if (c2.isAlive()){
                c2.kick(c1);
            }
            System.out.println("Results of battle:");
            System.out.println(name1 +"(hp:"+hp1+", power:"+power1+")" +" | "+name2 +"(hp:"+hp2+", power:"+power2+")");
            if (c1.isAlive()){
                System.out.println(name1 + " is the winner!");
            }
            else{
                System.out.println(name2 + " is the winner!");
            }
        }

    }
}
