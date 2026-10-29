class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        mid=len(s)//2
        a=s[:mid]
        b=s[mid:]
        v="aeiouAEIOU"
        return sum(ch in v for ch in a)==sum(ch in v for ch in b)