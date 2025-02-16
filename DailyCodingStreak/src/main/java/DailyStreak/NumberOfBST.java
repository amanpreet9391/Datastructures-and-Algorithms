package DailyStreak;

import java.util.Arrays;
import java.util.List;

class Tree{
    int data;
    Tree left;
    Tree right;

    public Tree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class NumberOfBST {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        int n = 3;
        int totalTrees = numberOfUniqueBST(list,n);

        System.out.println(totalTrees);
    }

    public static int numberOfUniqueBST(List<Integer> list, int n){

        if(n<=1){
            return 1;
        }

        int total = 0;

               for(int root=1;root<=n;root++){
                   int leftTrees = numberOfUniqueBST(list, root-1);
                   int rightTrees = numberOfUniqueBST(list, n-root);
                   total = total+leftTrees*rightTrees;
               }
               return total;
    }
}
