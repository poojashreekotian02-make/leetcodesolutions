class Solution(object):
    def halvesAreAlike(self, s):
        """
        :type s: str
        :rtype: bool
        """
        mid=len(s)//2
        a=s[:mid]
        b=s[mid:]
        v="aeiouAEIOU"
        return sum(ch in v for ch in a)==sum(ch in v for ch in b)