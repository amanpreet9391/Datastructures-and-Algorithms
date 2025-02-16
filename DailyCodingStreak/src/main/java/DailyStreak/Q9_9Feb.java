package DailyStreak;

public class Q9_9Feb {
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        String[] dict = {"leet","code"};
        String s = "leetcode";
        for(String ss: dict){
            createTrie(root, ss);
        }

        System.out.println(findWord(root,s,0));

    }

    public static void createTrie(TrieNode root,String s){
        TrieNode node = root;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index = c-'a';
            if(node.children[index]==null){
                node.children[index] = new TrieNode();
            }
            node = node.children[index];

        }
        node.eow = true;
    }

    public static boolean search(TrieNode root, String s){
        TrieNode node = root;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index = c-'a';
            if(node.children[index]==null){
                return false;
            }
            if(i<s.length()-1 && node.eow==true){
                return false;
            }
            node = node.children[index];
        }
        return node.eow;
    }

    public static boolean findWord(TrieNode root, String s, int start){
        if(s.isEmpty()){
            return false;
        }

        if(start>=s.length()-1){
            return true;
        }

        //Searching for a valid prefix
        for(int i=start+1;i<=s.length();i++){
            String ss = s.substring(start,i);
            if(search(root, ss) && findWord(root, s,i)){
                return true;
            }
        }

        return false;


    }
}

class TrieNode{
    boolean eow;
    TrieNode[] children;

    public TrieNode(){
        children = new TrieNode[26];
        this.eow = false;
    }
}
