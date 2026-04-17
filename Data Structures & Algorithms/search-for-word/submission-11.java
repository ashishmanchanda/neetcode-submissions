class Solution {
public boolean exist(char [][] board, String word) {
for (int i = 0; i < board.length; i++)
    for (int j = 0; j < board[0]. length; j++)
        if(word.charAt(0) == board[i][j] && exists(board, i, j, word, 0))
        return true;
return false;
}
}

private boolean exists(char[][] board, int i, int j, String word, int pos) {
if(pos == word. length()) return true;
if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false; 
if (word.charAt (pos) != board[i][j]) return false;
char temp = board[i][j];
board[i][j]='*';
if(exists(board, i + 1, j, word, pos + 1) ||
exists(board, i -1,j, word, pos + 1) || exists(board, i,j+1, word, pos + 1) ||
exists(board, i, j-1, word, pos + 1))
return true;
board[i][j]=temp;
return false;
}
