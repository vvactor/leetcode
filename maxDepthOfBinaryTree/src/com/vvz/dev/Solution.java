package com.vvz.dev;

import java.util.LinkedList;

public class Solution {
	
	/**
	 * Recursion Algorithm
	 * @param root
	 * @return
	 */
    public int maxDepth(TreeNode root) {

        if(null == root)
            return 0;

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);
        return  (depthLeft > depthRight? depthLeft: depthRight) + 1;
    }
    
    /**
     * No recursion
     */
    public static int maxDepthWithoutRecursion(TreeNode root) {

        if(null == root)
            return 0;
        LinkedList<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
        treeNodeQueue.add(root);
        int level = 0;
        while(!treeNodeQueue.isEmpty()) {
        	level ++;
        	int length = treeNodeQueue.size();
        	while(0 != length) {
        		TreeNode temp = treeNodeQueue.removeFirst();
        		if(null != temp.left) {
        			treeNodeQueue.add(temp.left);
        		}
        		if(null != temp.right) {
        			treeNodeQueue.add(temp.right);
        		}
        		length --;
        	}
        	
        }
        return level;
    }
    
    public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		
		t1.left = t2;
		t1.right = t3;
		maxDepthWithoutRecursion(t1);
	}
}
