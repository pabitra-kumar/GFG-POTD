import java.util.Arrays;

public class TransPoseOfMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        transpose(mat.length , mat);
        for(int[] i: mat)
        {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void transpose(int n, int a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(a, i, j);
            }
        }
    }

    static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}