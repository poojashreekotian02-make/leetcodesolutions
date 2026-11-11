class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        while (i < j) {
            if ("aeiouAEIOU".indexOf(a[i]) >= 0 &&
                "aeiouAEIOU".indexOf(a[j]) >= 0) {
                char t = a[i]; a[i] = a[j]; a[j] = t;
                i++; j--;
            } else if ("aeiouAEIOU".indexOf(a[i]) < 0) i++;
            else j--;
        }
        return new String(a);
    }
}