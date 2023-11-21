package com.g2b7.bsttoskewed.main;

import com.g2b7.treenode.TreeNode;
import com.g2b7.printskewedtree.PrintSkewekTree;
import com.g2b7.bsttoskewed.implementation.BSTToSkewed;

public class BSTToSkewedMain {
	public static void main(String[] args) {
        // Constructing a sample BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(9);

        // Convert the BST to a skewed tree
        TreeNode skewedRoot = BSTToSkewed.bstToSkewedTree(root);

        // Print the values of the skewed tree in ascending order
        System.out.println("Values of Skewed Tree in Ascending Order:");
        PrintSkewekTree.printSkewedTree(skewedRoot);
    }
}
