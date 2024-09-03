package Trie;


public class Trie {
    static class TrieNode {
        TrieNode[] arr;
        int wc;     // Word count at this node
        int we;     // End of a word count

        TrieNode() {
            arr = new TrieNode[26];
            wc = 0;
            we = 0;
        }
    }

    

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        insert(root, word, 0);
    }

    private void insert(TrieNode root, String word, int i) {
        if (i == word.length()) {
            root.we++;
            return;
        }

        char c = word.charAt(i);
        int index = c - 'a';

        if (root.arr[index] == null) {
            root.arr[index] = new TrieNode();
        }
        root.arr[index].wc++;  // Increment wc for each character
        insert(root.arr[index], word, i + 1);
    }

    public int countWordsEqualTo(String word) {
        return countWord(root, word, 0);
    }
    // word count
    private int countWord(TrieNode root, String word, int i) {
        if (i == word.length()) {
            return root.we;
        }

        char c = word.charAt(i);
        int index = c - 'a';

        if (root.arr[index] == null) {
            return 0;
        }

        return countWord(root.arr[index], word, i + 1);
    }
    // no of words starts with prefix
    public int countWordsStartingWith(String word) {
        return wordStart(root, word, 0);
    }

    private int wordStart(TrieNode root, String word, int i) {
        if (i == word.length()) {
            return root.wc;
        }

        char c = word.charAt(i);
        int index = c - 'a';

        if (root.arr[index] == null) {
            return 0;
        }

        return wordStart(root.arr[index], word, i + 1);
    }

    public void erase(String word) {
        erase(root, word, 0);
    }

    private void erase(TrieNode root, String word, int i) {
        if (i == word.length()) {
            if (root.we > 0) {
                root.we--;  // Decrease word end count
            }
            return;
        }

        char c = word.charAt(i);
        int index = c - 'a';

        if (root.arr[index] != null) {
            erase(root.arr[index], word, i + 1);

            // After recursion, decrease word count in current node
            if (root.arr[index].wc > 0) {
                root.arr[index].wc--;
            }

            // If the word count at the current node becomes 0, and it's not the end of any other word, set it to null
            if (root.arr[index].wc == 0 && root.arr[index].we == 0) {
                root.arr[index] = null;
            }
        }
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("chenna");
        t.insert("chenn");
        System.out.println(t.countWordsStartingWith("che"));
    }

}

