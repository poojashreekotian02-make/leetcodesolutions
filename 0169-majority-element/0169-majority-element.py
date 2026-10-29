class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count=0
        ans=nums[0]
        for n in nums:
            if count==0:
                ans=n
               
            if n==ans:
                  count+=1
            else:
                count-=1
        return ans

        
