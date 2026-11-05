class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        if (i == -1)
            return word;

        String s = "";

        for (int j = i; j >= 0; j--) {
            s = s + word.charAt(j);
        }

        return s + word.substring(i + 1);
    }
}