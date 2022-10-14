import lotr.Character;
import lotr.Elf;
import lotr.Knight;
import lotr.Hobbit;
import lotr.King;
import java.util.Random;
public class CharacterFactory{
     Character createCharacter() throws NoSuchMethodException, InstantiationException, IllegalAccessException{
         Character[] arrayOfTypes = {new Elf(), new King(), new Knight(), new Hobbit()};
          int rand = new Random().nextInt(arrayOfTypes.length);
          Character c = arrayOfTypes[rand];
          return c;
     }
}
