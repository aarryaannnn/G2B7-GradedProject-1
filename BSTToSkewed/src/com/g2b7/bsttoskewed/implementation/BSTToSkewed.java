package com.g2b7.bsttoskewed.implementation;

import com.g2b7.treenode.TreeNode;

public class BSTToSkewed  {

    // Helper function to perform in-order traversal and convert the BST to a skewed tree
    public static TreeNode bstToSkewedTree(TreeNode root) {
    	// Base case
        if (root == null) {
            return null;
        }

        // Recursively convert the right subtree
        root.right = bstToSkewedTree(root.right);

        // Perform right rotation
        while (root.left != null) {
            TreeNode leftChild = root.left;
            root.left = leftChild.right;
            leftChild.right = root;
            root = leftChild;
        }

        // Recursively convert the remaining left subtree
        root.right = bstToSkewedTree(root.right);

        return root;
    }
//        if (root == null) {
//            return prev;
//        }
//
//        // Recursive call on the left subtree
//        TreeNode left = bstToSkewedTree(root.left, root);
//
//        // Make the root the right child of its predecessor
//        root.left = null;
//        root.right = left;
//
//        // Update the predecessor
//        prev = root;
//
//        // Recursive call on the right subtree
//        return bstToSkewedTree(root.right, prev);
//    }

}
