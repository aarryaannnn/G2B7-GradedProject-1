package com.g2b7.printskewedtree;

import com.g2b7.treenode.TreeNode;

public class PrintSkewekTree {
    // Helper function to print the values of the skewed tree in ascending order
    public static void printSkewedTree(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }
}
	