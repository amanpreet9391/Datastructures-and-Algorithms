package DailyStreak;

public class Question3_3Feb {
    static int maxProfitValue = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Method call "+maxProfit(0,arr,false,0,0));
    }


    public static int maxProfit(int i, int[] arr, boolean buy,int profit,int count){

        if(i==arr.length){
            return profit;
        }
        if(count>=2){
            return profit;
        }

        if(!buy){
            return Math.max(maxProfit(i+1, arr, true,profit-arr[i],count),
                    maxProfit(i+1, arr, false,profit,count));
        }else{
            return Math.max(maxProfit(i+1, arr, false,profit+arr[i],count+1),
                    maxProfit(i+1, arr, true,profit,count));
        }
    }
}
