import java.util.HashMap;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String S = "zxvczbtxyzvy";
        char ans = nonrepeatingCharacter(S);
        System.out.println(ans);
    }
    static char nonrepeatingCharacter(String S)
    {
        HashMap<Character , Integer> m = new HashMap<>();
        for(char i : S.toCharArray())
        {
            if(m.containsKey(i))
            {
                m.put(i , 2);
            }
            else
            {
                m.put(i , 1);
            }
        }
        for(char i : S.toCharArray())
        {
            if(m.get(i)==1)
            return i;
        }
        return '$';
    }
}