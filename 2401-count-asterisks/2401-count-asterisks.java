class Solution {
    public int countAsterisks(String s) {
        int count = 0, pipeCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '|') pipeCount++;
            else if (c == '*' && pipeCount % 2 == 0) count++;
        }
        return count;
    }
}
    
