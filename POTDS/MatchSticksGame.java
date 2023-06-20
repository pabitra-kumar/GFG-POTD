public class MatchSticksGame {
    public static void main(String[] args) {
        System.out.println(matchGame(48L));
    }
    static int matchGame(Long N) {
        return (N%5 == 0) ? -1 : (int)(N%5) ;
    }
}
