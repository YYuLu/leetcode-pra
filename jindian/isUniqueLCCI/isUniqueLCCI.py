class Solution():
    def isUnique(self, astr: str) -> bool:
        mark = 0
        for str in astr:
            move_bit = ord(str) - ord('a')
            if (mark & (1 << move_bit)) != 0:
                return False
            else:
                mark |= (1 << move_bit)
        return True

    def isUniqueSet(self,astr:str) -> bool:
        sets = set(astr)
        if len(astr) == len(sets):
            return True
        else:
            return False


if __name__ == "__main__":
    solution = Solution()
    teststr = "inds"
    print(solution.isUnique(teststr))
    print(solution.isUniqueSet(teststr))
