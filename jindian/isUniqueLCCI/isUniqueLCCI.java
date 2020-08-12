class Solution {
    public boolean isUnique(String astr) {
        int mark = 0;
        for (char str : astr.toCharArray()) {
            int move_bit = str - 'a';
            if ((mark & (1 << move_bit)) != 0) {
                return false;
            } else {
                mark |= (1 << move_bit);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUnique("jdijfwokjfls"));
    }
}