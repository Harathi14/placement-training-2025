import java.util.*;

class Pangram {
  public static void main(String[] args) {
    String[] inputs = {
      "the quick brown fox jumps over",
      "the lazy dog",
      "abcd"
    };
    for (String s : inputs) {
      boolean[] seen = new boolean[26];
      for (char c : s.toLowerCase().toCharArray())
        if (c >= 'a' && c <= 'z') seen[c - 'a'] = true;
      System.out.println(
        Arrays.stream(seen).allMatch(b -> b) ? "pangram" : "not pangram"
        );
    }
  }
}
