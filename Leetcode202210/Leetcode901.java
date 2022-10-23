package Leetcode202210;

public class Leetcode901 {
    List<Integer> list;
    int cnt;
    public StockSpanner() {
        list = new ArrayList();
        cnt = -1;
    }
    
    public int next(int price) {
        list.add(price);
        int len = list.size();
        if(cnt < 0){
            cnt = 0;
            return 1;
        }
        else if(list.get(len-2) > price){
            cnt = len-1;
            return 1;
        }
        else{
            while(cnt>=0 && list.get(cnt)<=price) cnt--;
            if(cnt < 0){
                cnt = 0;
                return len;
            }else return len-cnt-1;
        }
    }
}
