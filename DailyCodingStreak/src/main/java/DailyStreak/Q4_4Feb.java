package DailyStreak;

public class Q4_4Feb {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] matrix = new int[m][n];
        matrix[0] = new int[]{1, 3, 2};
        matrix[1] = new int[]{4, 3, 1};
        matrix[2] = new int[]{5, 6, 1};

        System.out.println(traverse(matrix,0,0,matrix.length, matrix[0].length));

    }

    public static int traverse(int[][] matrix, int x, int y, int m, int n){
        if(x>=m || y>=n){
            return Integer.MAX_VALUE;
        }

        if(x==m-1 && y==n-1){
            return matrix[x][y];
        }

        int minSum = matrix[x][y] + Math.min(traverse(matrix,x+1,y,m,n),traverse(matrix,x,y+1,m,n));

        return minSum;
    }
}
