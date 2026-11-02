class Solution:
    def romanToInt(self, s: str) -> int:
        d={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        n=0
        for i in range(len(s)):
            n += -d[s[i]] if i+1<len(s) and d[s[i]]<d[s[i+1]] else d[s[i]]
        return n
