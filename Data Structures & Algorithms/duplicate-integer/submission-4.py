class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        counts = {}
        for i in nums:
            counts[i] = counts.get(i, 0) + 1
        
        for count in counts.values():
            if count > 1:
                return True
        
        return False
        