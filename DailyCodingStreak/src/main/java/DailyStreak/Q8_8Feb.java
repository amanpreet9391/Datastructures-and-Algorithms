package DailyStreak;

public class Q8_8Feb {
    public static void main(String[] args) {
        String s = "abaa";
        boolean[][] dp = new boolean[s.length()][s.length()];

        for(int i=0;i<s.length();i++){
            dp[i][i] = true;
        }

        for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i)==s.charAt(i+1)){
               dp[i][i+1] = true;
           }
        }

        for(int i=2;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                int k = i+j;
                if(k<s.length() && j+1<s.length() && s.charAt(j)==s.charAt(k) && dp[j+1][k-1]){
                    dp[j][k] = true;
                }
            }
        }

        int[] minCount = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(dp[0][i]){
                minCount[i] = 0;
            }else{
                minCount[i] = i;
                for(int j=0; j<i;j++){
                    if(dp[j+1][i]){
                        minCount[i] = Math.min(minCount[i], minCount[j]+1);
                    }
                }
            }
        }
        System.out.println(minCount[s.length()-1]);
    }
}
