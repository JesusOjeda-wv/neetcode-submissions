class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen_nums = []

        for i in range(len(nums)):
            if nums[i]  in seen_nums:
                return True
            else:
                seen_nums.append(nums[i])
        return False
            


        