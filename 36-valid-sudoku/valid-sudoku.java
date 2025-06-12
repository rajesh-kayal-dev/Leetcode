class Solution {
    public boolean isValidSudoku(char[][] board) {

    // 9 rows, 9 columns, 9 boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

    // Initialize all sets
          for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

    // Loop through each cell
        for(int i = 0;i < 9;i++){
            for(int j = 0; j < 9;j++){
                char nums = board[i][j];
                if(nums == '.') continue;// skip empty cells
        
    //check rows
         if (rows[i].contains(nums)) return false;
                rows[i].add(nums);

    //check cols
        if(cols[j].contains(nums)) return false;
        cols[j].add(nums);
        
    // check 3x3 box
        int boxIndex = (i / 3) * 3 + (j / 3);
        if(boxes[boxIndex].contains(nums)) return false;
        boxes[boxIndex].add(nums);

        }
      }
      return true;
        
    }
}
