from typing import List


class Solution(object):
    def permute(self, nums):
        return [[n] + p
                for i, n in enumerate(nums)
                for p in self.permute(nums[:i] + nums[i + 1:])] or [[]]


class Solution2:
    def __init__(self):
        self.res = []

    def permute0(self, nums, lenth_of_nums, sublist):
        if len(sublist) == lenth_of_nums:
            self.res.append(sublist)
            return
        for k, i in enumerate(nums):
            sublist_copy = sublist.copy()
            sublist_copy.append(i)
            self.permute0(nums[:k] + nums[k + 1:], lenth_of_nums, sublist_copy)

    def permute(self, n: List[int]) -> List[List[int]]:
        self.res = []
        self.permute0(n, len(n), [])
        return self.res




if __name__ == '__main__':
    s = Solution2()
    print(s.permute([1, 2, 3]))
