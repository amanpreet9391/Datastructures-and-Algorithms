package DailyStreak;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,1,4};
        System.out.println(canReachLast(arr,0));
    }

    public static boolean canReachLast(int[] arr, int index){
        if(arr[index]==0){
            return false;
        }
        if(index==arr.length-1){
            return true;
        }

        boolean canReach = false;
        for(int i=1;i<=arr[index];i++){
            if(canReachLast(arr,index+i)){
                canReach = true;
            }
        }
        return canReach;
    }
}
