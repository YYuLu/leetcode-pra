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


if __name__ == "__main__":
    solution = Solution()
    print(solution.isUnique("isnque"))
