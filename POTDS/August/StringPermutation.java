package August;

import java.util.*;

public class StringPermutation {
    public static void main(String[] args) {
        String S = "CDBA";
        StringPermutation ob = new StringPermutation();
        ArrayList<String> ans = ob.permutation(S);
        System.out.println("Permutations of the String '" + S + "' is :");
        System.out.println(ans);
    }

    public ArrayList<String> permutation(String S) {
        ArrayList<String> a = new ArrayList<>();
        String perm = "";
        if (S.length() == 0)
            return a;
        permutation(a, S, perm);
        Collections.sort(a);
        return a;
    }

    public void permutation(ArrayList<String> a, String S, String perm) {
        if (S.length() == 0) {
            a.add(perm);
            return;
        }
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            String str = S.substring(0, i) + S.substring(i + 1);
            permutation(a, str, perm + ch);
        }
    }

}
