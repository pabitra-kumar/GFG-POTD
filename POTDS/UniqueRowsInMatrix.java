import java.util.ArrayList;
import java.util.HashSet;

public class UniqueRowsInMatrix {
    public static void main(String[] args) {
        int[][] a = {{1 , 1 , 0 , 1},{1, 0, 0, 1},{1, 1, 0, 1}};
        System.out.println(uniqueRow(a, a.length, a[0].length));
    }
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        
        HashSet<ArrayList<Integer>> arr = new HashSet<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int[] i : a)
        {
            int p = arr.size();
             ArrayList<Integer> temp = new ArrayList<>();
            for(int j : i)
            {
                temp.add(j);
            }
            arr.add(temp);
            if(arr.size() > p)
            res.add(temp);
        }
        return res;
    }
}
