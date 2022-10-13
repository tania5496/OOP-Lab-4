public class GameManager{
    void fight (Character c1, Character c2){
        int power1 = c1.getPower();
        int power2 = c2.getPower();
        if (power1 == power2){
            System.out.println("Those characters have equal power");
        }
        else if (power1 > power2) {
            System.out.println("First character has more power than second.");
        }
        else{
            System.out.println("Second character has more power than first.");
        }
    }
}
