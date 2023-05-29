import java.util.*;
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int reserve = money - prices[0]-prices[1];
        if (reserve>=0)
            return reserve ;
        return money ;
    }
}