class Solution(object):
    def permute(self, nums):
        return [[n] + p
                for i, n in enumerate(nums)
                for p in self.permute(nums[:i] + nums[i + 1:])] or []


if __name__ == '__main__':
    a = 1
    print(0 or 2)
