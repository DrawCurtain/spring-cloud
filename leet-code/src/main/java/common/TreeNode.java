package common;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/30 15:13
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode() {
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }
}
