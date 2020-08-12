class Solution {
    public boolean isUnique(String astr) {
        int mark = 0;
        for (char str : astr.toCharArray()) {
            int move_bit = str - 'a';
            if ((mark & (1 << move_bit)) != 0) {//与运算，为1说明已存在过该字符
                return false;
            } else {
                mark |= (1 << move_bit);//或运算，将字符存为位标记
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        long startTime = System.currentTimeMillis();
        System.out.println(solution.isUnique("isUnique"));
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); 
    }
}