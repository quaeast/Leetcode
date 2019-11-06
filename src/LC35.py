from typing import List


class Solution35:
    def searchInsert(self, nums: List[int], target: int) -> int:
        for i in range(len(nums)):
            if nums[len(nums) - i - 1] == target:
                return len(nums) - i - 1
            elif nums[len(nums)-i-1] < target:
                return len(nums) - i
        return 0


if __name__ == '__main__':
    s = Solution35()
    s.searchInsert([1, 2, 3], 1)
