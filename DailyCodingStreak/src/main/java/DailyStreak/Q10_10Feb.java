package DailyStreak;

public class Q10_10Feb {
    public static void main(String[] args) {
        String a = "adceb";
        String b = "*a*b";
        System.out.println(isMatch(a,b));
    }
    public static boolean isMatch(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        int i=0;
        int j=0;

        while(i<aArray.length && j<bArray.length){
            if(bArray[j]=='?'){
                j++;
                i++;
            }
            else if(bArray[j]=='*'){
                while(i<aArray.length && j<bArray.length-1 && bArray[j+1]!=aArray[i]){
                    i++;
                }
                if(j==bArray.length-1 && bArray[j]=='*'){
                    return true;
                }
                i++;
                j++;
            }
            else if(bArray[j]==aArray[i]){
                i++;
                j++;
            }
            else{
                return false;
            }
        }
        if(i<aArray.length){
            return false;
        }
        return true;
    }
}
