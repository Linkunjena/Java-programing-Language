class Solution {
    static int count=0;
    static void dfs( int i, int j,int n , int m, int grid[][] )
    {
        if( i<0 || j<0 || i==n || j==m || grid[i][j]==0)
        {
            return;
        }

        // otherwise we have reached a cell which is having value 1
        count++;
        grid[i][j]=0;

        //top
        dfs(i-1,j,n,m,grid);
        //down
        dfs(i+1,j,n,m,grid);
        //left
        dfs(i,j-1,n,m,grid);
        //right
        dfs(i,j+1,n,m,grid);

    }
    public int maxAreaOfIsland(int[][] grid) {

        int ans=0;
        int n = grid.length;
        int m = grid[0].length;

        for( int i=0;i<n;i++)
        {
             for( int j=0;j<m;j++)
             {
                 if( grid[i][j]==1)
                 {
                      count=0;
                      dfs(i,j,n,m,grid);
                      // if no of lands is more in this connected component 
                      // then update the ans
                      if( count> ans)
                      {
                         ans= count;
                      }
                 }
             }
        }
        return ans;
        
    }
}