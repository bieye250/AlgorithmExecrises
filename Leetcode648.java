public class Leetcode648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for(var s : dictionary){
            Trie t = trie;
            for(int i=0;i<s.length();i++){
                var c = s.charAt(i);
                Trie child = new Trie();
                t.map.putIfAbsent(c,new Trie());
                t = t.map.get(c);
            }
            t.map.putIfAbsent('*', new Trie());
        }
        var words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            words[i] = findMin(trie,words[i]);
        }
        return String.join(" ", words);
    }
    public String findMin(Trie t, String s){
        var sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(t.map.containsKey('*')) return sb.toString();
            if(!t.map.containsKey(s.charAt(i))) return s;
            t = t.map.get(s.charAt(i));
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
class Trie{
    Map<Character,Trie> map;

    public Trie(){
        map = new HashMap<Character,Trie>();
    }
}
