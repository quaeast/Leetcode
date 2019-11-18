from typing import List


class Solution:
    def __init__(self):
        self.res = []

    def permute0(self, nums, lenth_of_nums, sublist):
        if len(sublist) == lenth_of_nums and sublist not in self.res:
            self.res.append(sublist)
            return
        for k, i in enumerate(nums):
            sublist_copy = sublist.copy()
            sublist_copy.append(i)
            self.permute0(nums[:k] + nums[k + 1:], lenth_of_nums, sublist_copy)

    def permuteUnique(self, n: List[int]) -> List[List[int]]:
        self.res = []
        self.permute0(n, len(n), [])
        return self.res


class Solution2:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        unique_perms = [[]]
        if nums == []:
            return unique_perms
        if len(nums) == 1:
            return [nums]
        for n in nums:
            el_perm = []
            for perm in unique_perms:
                for i in range(len(perm) + 1):
                    el_perm.append(perm[:i] + [n] + perm[i:])
                    if i < len(perm) and perm[i] == n:
                        break
            unique_perms = el_perm

        return unique_perms


if __name__ == "__main__":
    s = Solution()
    a = [1, 1, 2]
    o = s.permuteUnique(a)
    print(o)
