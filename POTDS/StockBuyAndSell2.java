public class StockBuyAndSell2 {
    public static void main(String[] args) {
        int prices[] = {100, 180, 260, 310, 40, 535, 695};
        int res = stockBuyAndSell(prices.length, prices);
        System.out.println(res);
    }
    public static int stockBuyAndSell(int n, int[] prices) {
        int c = 0 , st = -1;
        for(int i : prices)
        {
            if(st == -1) st = i;
            else if(i > st)
            {
                c += i-st;
            }
            st = i;
        }
        return c;
    }
}
