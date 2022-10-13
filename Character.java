public class Character {
    int power;
    int hp;
//     - attributes: int power, in hp
//   - methods: void kick(Character c), boolean isAlive()
}
public class Hobbit{
    int power = 0;
    int hp = 3;
//     - attributes: int power=0, int hp=3
//   - methods: void kick(Character c) { toCry() }
}
public class Elf{
    int power = 10;
    int hp = 10;
//     - attributes: int power=10, int hp=10
//   - methods: void kick(Character c) {
//                 kill everybody weaker than him,
//                 otherwise decrease the power of character by 1
//               }
}
public class King{
    int power;
    int hp;
//     - attributes: int power=from 5 to 15, int hp=from 5 to 15
//   - methods: void kick(Character c) {
//                 decrease number of hp of the enemy by random
//                 number which will be in the range of his power
//               }
}
public class Knight{
    int power;
    int hp;
//     - attributes: int power=from 2 to 12, int hp=from 2 to 12
//   - methods: void kick(Character c) { like King }
}
public class CharacterFactory{
    // Character createCharacter() {}
}
public class GameManager{
    // void fight(Character c1, Character c2){}
}
