package code;

import common.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/30 15:14
 */

public class TreeTraversal {

    /**
     * @description: 前序递归遍历
     * @param: root
     * @return: void
     * @author xuegang
     * @date: 2021/8/30 15:17
     */
    public static void preOrder(TreeNode root){
        if (root == null) {
            return;
        }
        System.out.println(root.toString());
        preOrder(root.left);
        preOrder(root.right);
    }

    /** 
     * @description: 前序非递归遍历
     * @param: treeNode 
     * @return: void 
     * @author xuegang
     * @date: 2021/8/30 15:27
     */ 
    public static void preOrderTree(TreeNode treeNode){
        if (treeNode == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.left != null){
                stack.push(node.left);
            }
            if (node.right != null){
                stack.push(node.right);
            }
        }
    }


    /**
     * @description: 中序非递归遍历
     * @param: treeNode
     * @return: void
     * @author xuegang
     * @date: 2021/8/30 16:10
     */
    public static void inOrderTree(TreeNode treeNode){
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.isEmpty()){
            while (treeNode != null){
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            if (!stack.isEmpty()){
                treeNode = stack.pop();
                System.out.println(treeNode.val);
                treeNode = treeNode.right;
            }
        }
    }

    /**
     * @description: 后续非递归遍历
     * @param: tree
     * @return: void
     * @author xuegang
     * @date: 2021/8/30 16:10
     */
    public static void backOrder(TreeNode tree){
        if (tree == null)
            return;
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();

        stack1.push(tree);

        while (!stack1.isEmpty()){
            tree = stack1.pop();
            stack2.push(tree);
            if (tree.left != null){
                stack1.push(tree.left);
            }
            if (tree.right != null){
                stack1.push(tree.right);
            }
        }
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop().val);
        }
    }

    /**
     * @description: 层序遍历非递归
     * @param: treeNode
     * @return: void
     * @author xuegang
     * @date: 2021/8/30 16:18
     */
    public static void levelOrder(TreeNode treeNode){
        if (treeNode == null){
            return;
        }
        LinkedList<TreeNode> nodes = new LinkedList();
        nodes.add(treeNode);
        while (!nodes.isEmpty()){
            treeNode = nodes.pop();
            System.out.println(treeNode.val);
            if (treeNode.left != null){
                nodes.add(treeNode.left);
            }
            if (treeNode.right != null){
                nodes.add(treeNode.right);
            }
        }
    }


    public static int getLevel(TreeNode tree){
        if (tree == null) {
            return 0;
        }
        return Math.max(getLevel(tree.left),getLevel(tree.right))+1;

    }

    public static void printLevel(TreeNode treeNode, int level){
        if (treeNode == null){
            return;
        }
        if (level == 0){
            System.out.println(treeNode.val);
        }else {
            printLevel(treeNode.left,level-1);
            printLevel(treeNode.right,level-1);
        }

    }
    
}
