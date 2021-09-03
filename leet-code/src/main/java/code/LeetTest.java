package code;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/30 16:44
 */

public class LeetTest {


    //100以内相加
    public static int sum(int num){
        if (num == 1){
            return 1;
        }
        return sum(num-1)+num;
    }

    //阶乘
    public static int factorial(int num){
        if (num == 1){
            return 1;
        }
        return factorial(num-1) * num;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
