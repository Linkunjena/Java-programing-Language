
class Pair
{
	TreeNode node;
	int x;
	
	Pair( TreeNode node, int x)
	{
		 this.node=node;
		 this.x=x;
	}
}
public class BottomViewOfBinaryTree
{
	static ArrayList<Integer> bottomView(TreeNode root)
	{
		ArrayList<Integer>ans= new ArrayList<>();
		
		// if the tree is empty then return the empty ans
		if( root==null)
		{
			return ans;
		}
		
		TreeMap<Integer,Integer>mp= new TreeMap<>();
		Queue<Pair>q= new LinkedList<>();
		
		q.add( new Pair(root,0));
		
		while(q.size()>0)
		{
			Pair p= q.remove();
			
			TreeNode curr= p.node;
			int x= p.x;
			
			mp.put(x,curr.val);
			
			// left child exists for curr
			if(curr.left!=null)
			{
				q.add( new Pair(curr.left,x-1));
			}
			if(curr.right!=null)
			{
				q.add( new Pair( curr.right,x+1));
			}
		}
		
		for( int val : mp.values())
		{
			ans.add( val );
		}
		return ans;
		
	}
}











