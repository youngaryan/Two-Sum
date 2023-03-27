import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //[3,2,4]
        //[3,3]
        int [] test = new int[4];
//        test[0] = 3;
//        test[1] = 2;
//        test[2] = 4;
//          test[0] = 3;
//          test[1] = 3;
        test[0] = 2;
        test[1] = 5;
        test[2] = 5;
        test[3] = 11;
        int target = 10;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(test, target)));
    }
}
