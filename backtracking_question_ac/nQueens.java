public class nQueens {
    static int queens(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //placing the queen and checking for every row and col
        for(int col=0;col<board.length;col++){
            // place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false; //backtracking
            }
        }

        return count;
         

    }
    static boolean isSafe(boolean[][] board,int row, int col){
        //for vertical check
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        // for diagonal left check
        int maxLeft = Math.min(row,col); //maximum time u can go left
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // for diagonal right check
        int maxRight = Math.min(row,board.length-col-1); //maximum time u can go right
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
        
    }

    private static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
   
    
}
