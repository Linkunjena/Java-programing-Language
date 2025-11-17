
class Solution {
    static int mi =Integer.MAX_VALUE;

    static void dfs( TreeNode curr, int level)
    {
         if( curr==null)
         {
            return;
         }

         if( curr.left==null && curr.right==null)
         {
             // leaf node  compare level
             mi = Math.min( mi, level);
             return;
         }

         dfs( curr.left, level+1);
         dfs( curr.right, level+1);
    }
    public int minDepth(TreeNode root) {
        
        if( root==null)
        {
             return 0;
        }
        mi =Integer.MAX_VALUE;

        dfs( root ,1);

        return mi;
    }
}