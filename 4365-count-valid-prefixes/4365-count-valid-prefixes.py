class Solution:
    def countValidPrefixes(self, s: str) -> int:
        return sum(abs(s[:i].count('0') - s[:i].count('1')) <= 1 for i in range(1, len(s)+1))
