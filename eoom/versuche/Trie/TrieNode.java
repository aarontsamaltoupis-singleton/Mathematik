import java.util.Map;
import java.util.TreeMap;

public class TrieNode {
    private final TreeMap<Character, TrieNode> successors = new TreeMap<>();
}
private int prefixCount = 0;
private int wordCount = 0;

public void add(final String word){
    ++prefixCount;
    if (word.isEmpty()){
        ++wordCount;
    }
    else{
        final Character currentChar = word.charAt(0);
        TrieNode trieNode = successors.get(currentChar);
        if (trieNode == null){
            trieNode = new TrieNode();
            successors.put(currentChar,trieNode);
        }
        trieNode.add(word.substring(1));
    }
}

