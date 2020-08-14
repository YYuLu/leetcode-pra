import java.util.HashMap;

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

    public boolean isUniqueMap(String astr) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < astr.length(); i++)
        {
            int count = result.getOrDefault(astr.charAt(i), 0) + 1;
            if (count > 1) {return false;}
            result.put(astr.charAt(i), count);
        }
        return true;

        // for (Map.Entry<Character, Integer> entry : result.entrySet())
        // {
        //     if (entry.getValue() != 1)
        //     {
        //         return false;
        //     }
        // }
        // return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String teststr = new String("isjjkq");
        System.out.println(solution.isUnique(teststr));
        System.out.println(solution.isUniqueMap(teststr));
    }
}