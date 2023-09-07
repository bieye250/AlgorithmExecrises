package Leetcode202309;

public class Leetcode2840 {
    public boolean checkStrings(String s1, String s2) {
        var c1 = new char[26];
        var c2 = new char[26];
        var c11 = new char[26];
        var c22 = new char[26];

        for(int i=0; i<s1.length(); i++){
            if(i%2 == 0) c1[s1.charAt(i)-'a']++;
            else c11[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<s2.length(); i++){
            if(i%2 == 0) c2[s2.charAt(i)-'a']++;
            else c22[s2.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if(c1[i] != c2[i] || c11[i] != c22[i]) return false;
        }
        return true;
    }
}
