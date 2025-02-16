package DailyStreak;

import java.util.HashMap;
import java.util.Map;

public class Array1 {
    public static void main(String[] args) {
        int[] A = {2,1,2,1};
        System.out.println(findMajority(A));

    }
    public static int findMajority(int[] A){
        int N = A.length;
        double  floor = Math.floor(N / 2.0);
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            int e = A[i];
            int value = 0;
            if(map.containsKey(e)){
                value = map.get(e);
            }
            value++;
            if(value>floor){
                return e;
            }
            map.put(e,value);
        }

        return -1;
    }
}
