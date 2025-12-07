public class Trie {
    private final TrieNode
    root = new TrieNode();

    public Trie(){}

    public void add(final String word){
        root.add(word);
    }
}
