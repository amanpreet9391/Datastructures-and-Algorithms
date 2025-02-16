package DailyStreak;

public class Question2_2Feb {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,-2,-1};
        int maxProduct = 1;
        int l = 0;

        System.out.println(findMaxProduct(0, arr, maxProduct));

    }

    public static int findMaxProduct(int index, int[] arr, int maxProduct){
        if(index==arr.length){
            return 1;
        }
        int product = arr[index];
        for(int i=index+1;i<arr.length;i++){
            product = product * arr[i];
            maxProduct = Math.max(maxProduct,product);
            findMaxProduct(i, arr, maxProduct);
        }
        return maxProduct;
    }
}
