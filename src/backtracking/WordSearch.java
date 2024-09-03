package backtracking;

// word search using "TRIE"
//check whether giving word is present  or not
public class WordSearch {
    static class Trie{
        Trie[] children;
        boolean isEnd;

        Trie(){
            children = new Trie[26];
            isEnd = false;
        }
        public void addWord(String word){
            Trie curr = this;
            for(int i=0;i<word.length();i++){
                int index = word.charAt(i) - 'a';
                if(curr.children[index] == null){
                    // currently this char is present
                    curr.children[index] = new Trie();
                }
               curr = curr.children[index];
            }
            curr.isEnd = true;
        }
    }

    public static  boolean wordSearch(char[][] board,String s,Trie trie){
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(board,s,i,j,0,trie)) return true;
            }
        }
        return false;
    }
    public static boolean helper(char[][] board,String s,int row,int col,int i,Trie trie){
        if(i == s.length() || trie.isEnd) return true;

        if(row<0 || col <0 || row == board.length || col == board[0].length || board[row][col] != s.charAt(i) || board[row][col] == '#')
            return false;
        int index = board[row][col] - 'a';
        if(trie.children[index] == null){
            return false;
        }
        trie = trie.children[index];
        // visited
        char temp = board[row][col];
        board[row][col] = '#';

        boolean ans = helper(board,s,row+1,col,i+1,trie) ||  helper(board,s,row-1,col,i+1,trie) ||
                helper(board,s,row,col+1,i+1,trie) ||  helper(board,s,row,col-1,i+1,trie);
        board[row][col] = temp;
        return ans;
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        String s = "abcce";
        trie.addWord(s);
        char[][] arr= {
            {'a','b','c','e'},
            {'s','f','c','s'}, {'a','d','l','e'}
        };
        System.out.println(wordSearch(arr,"abcce",trie));
    }
}
