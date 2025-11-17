class Triplet
{
     int x,y,t;
     Triplet( int x, int y , int t)
     {
         this.x=x;
         this.y=y;
         this.t=t;
     }
}
class Solution {
    static int fresh=0;
    public int orangesRotting(int[][] grid) 
    {
         int n = grid.length;
         int m = grid[0].length;

         fresh=0;

         Queue<Triplet>q= new LinkedList<>();

         for( int i=0;i<n;i++)
         {
             for( int j=0;j<m;j++)
             {
                  if( grid[i][j]==2)
                  {
                       q.add( new Triplet(i,j,0) );
                  }
                  else if( grid[i][j]==1)
                  {
                      fresh++;
                  }
             }
         }

         int ans=0;
        
         while( q.size()>0)
         {
             Triplet tri = q.remove();
             int i= tri.x;
             int j= tri.y;
             int t= tri.t;
             
             // we keep a track of highest time taken
             ans = Math.max( ans, t);

             // top
             if( i-1>=0 && grid[i-1][j]==1)
             {
                 fresh--;
                 grid[i-1][j]=2;
                 q.add( new Triplet(i-1,j,t+1));
             }
             // down
             if(i+1<n && grid[i+1][j]==1)
             {
                 grid[i+1][j]=2;
                 fresh--;
                 q.add( new Triplet( i+1,j,t+1));
             }

             // left
             if(j-1>=0 && grid[i][j-1]==1)
             {
                 grid[i][j-1]=2;
                 fresh--;
                 q.add( new Triplet(i,j-1,t+1));
             }

             // right
             if(j+1<m && grid[i][j+1]==1)
             {
                 grid[i][j+1]=2;
                 fresh--;
                 q.add( new Triplet(i,j+1,t+1));
             }
         }

         if( fresh==0)
         {
             return ans;
         }
         else
         {
             return -1;
         }
    }
}