package DailyStreak;

public class Q6_6Feb {
    public static void main(String[] args) {
        int[][] arr = {{1}};
        int bottomLine = arr.length;
        System.out.println(arr[0][0] + findMinSum(1,0,bottomLine,arr));
    }

    public static int findMinSum(int i, int j, int bottomLine, int[][] arr){
        if(i==bottomLine){
            return 0;
        }

        int jThSum = arr[i][j] + findMinSum(i+1,j,bottomLine,arr);
        int jPlusOneThSum = arr[i][j+1] + findMinSum(i+1,j+1,bottomLine,arr);

        int minSum = Math.min(jThSum, jPlusOneThSum);
        return minSum;
    }
}
