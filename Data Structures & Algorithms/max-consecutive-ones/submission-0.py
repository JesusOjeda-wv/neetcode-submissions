class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:

        consecutive_num = 0
        counter = 0
        for i in range(len(nums)):
            
            if nums[i] == 1:
                counter += 1
                if counter > consecutive_num:
                    consecutive_num = counter
            else:
                counter = 0

        return consecutive_num
            


        