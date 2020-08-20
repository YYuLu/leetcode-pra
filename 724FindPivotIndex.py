class PivotIndex:
    def pivotIndex(self, nums):
        summ = sum(nums)
        leftsum = 0
        for i, x in enumerate(nums):
            if leftsum == summ - leftsum - x:
                return i
            leftsum += x
        return -1

if __name__ == "__main__":
    solution = PivotIndex()
    print(solution.pivotIndex([1,7,3,6,5,6]))
