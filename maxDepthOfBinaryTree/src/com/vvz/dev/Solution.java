package com.vvz.dev;

public class Solution {
    public int maxDepth(TreeNode root) {

        if(null == root)
            return 0;

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);
        return  (depthLeft > depthRight? depthLeft: depthRight) + 1;
    }
}
