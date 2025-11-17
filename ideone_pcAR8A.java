static boolean dfs( int curr, int par, int vis[], ArrayList<ArrayList<Integer>>adj)
{
	vis[curr]=1;
	// iterate on all the connections of the curr node
	for( int conn : adj.get(curr) )
	{
		// curr is already visited and is not the parent of curr
		// cycle detected
		if( vis[conn]==1 && conn!=par)
		{
			return true;
		}
		else if( vis[conn]==0)
		{
			int result = dfs(conn, curr, vis, adj);
			
			if( result==true)
				return true;
		}
	}
	return false;
}
static boolean detectCycle( ArrayList<ArrayList<Integer>>adj)
{
	int n = adj.size();
	int vis[]= new int[n];
	
	return dfs( 0, -1, vis, adj);
}