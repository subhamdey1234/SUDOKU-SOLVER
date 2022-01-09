public class Main {
  
public static boolean issafe(int [][]board,int col,int row,int num)

{
  for(int d=0;d<board.length;d++)
  {
    if(board[row][d]==num)
      return false;
  
  for(int f=0;f<board.length;f++)
  {
    if(board[f][col]==num)
      return false;
    
  }}
  int sq=(int)Math.sqrt(board.length);
  int rowstart=row-row%sq;
  int colstart=col-col%sq;
  for(int d=rowstart;d<rowstart+sq;d++)
  {
    
  for(int f=colstart;f<colstart+sq;f++)
  {
    if(board[d][f]==num)
      return false;
  
  }
  }
  

  
  return true;
  
}
public static boolean sudokusolver(int board[][],int n)
{
  int row=-1;
  int col=-1;
  boolean isEmpty=true;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(board[i][j]==0)
      {
      
      row=i;
      col=j;
      isEmpty=false;
      break;
    }
  }
if(!isEmpty) {
  break;
}}
  if (isEmpty)
  {
    return true;
  }
  for(int num=1;num<=n;num++)
  {
    if(issafe(board,col,row,num))
    {
      board[row][col]=num;
      
      if(sudokusolver(board,n))
      
        return true;
      
      
      else {
        board[row][col]=0;
        
      }
    }
  }
  
  return false;
}
public static void print(
        int[][] board, int N)
    {
         
        
        for (int d = 0; d < N; d++)
        {
            for (int f = 0; f < N; f++)
            {
                System.out.print(board[d][f]);
                System.out.print(" ");
            }
            System.out.print("\n");
 
            if ((d + 1) % (int)Math.sqrt(N) == 0)
            {
                System.out.print("");
            }
        }
    }


public static void main(String args[])
{

    int[][] board = new int[][] {
        { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
    };
    int N = board.length;

    if (sudokusolver(board, N))
    {
        // print solution
        print(board, N);
    }
    else {
        System.out.println("No solution");
    }
}
}
