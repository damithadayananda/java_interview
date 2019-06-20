import java.util.*;

public class StringClass {
    public void String_demo(){
        System.out.println("*************Split String*******");

        String str = new String("damitha,maljinee,dayananda");
        String[] stringArray = str.split(",");
        for (String s : stringArray){
            System.out.println(s);
        }

        System.out.println("*************Sub String*********");

        String s = str.substring(8);
        System.out.println(s);

        System.out.println("*************toCharArray*********");

        String sca= new String("dam");
        char[] characters = sca.toCharArray();

        for(int i=0;i<characters.length;i++){
            System.out.println(characters[i]);
        }

        System.out.println("********reverse characters*******");
        Character[] reverseCharacter = {'A','B','C'};
        Collections.reverse(Arrays.asList(reverseCharacter));

        for(Character c:reverseCharacter){
            System.out.println(c);
        }
    }
}
