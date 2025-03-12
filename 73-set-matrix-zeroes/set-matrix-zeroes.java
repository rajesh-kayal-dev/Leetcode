class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length, n =arr[0].length;
        /*
        int [][] helper = new int[m][n];
        //copy the array into helper array
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                helper [i][j]= arr[i][j];
            }
        }
        //check 0 in helper array 
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(helper[i][j]==0){
                    //set ith row and jth column in 0
                    for(int b = 0;b<n;b++){//row
                        arr[i][b]=0;
                    }
                    for(int a = 0;a<m;a++){
                        arr[a][j]=0;//col
                    }
                }
            }
        }
        */
        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];
        //marking the particular row and column 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        //set the true row to 0
        for(int i = 0; i < m; i++){
            if(row[i]==true){//set ith row to zero
                for(int j = 0;j < n; j++){
                    arr[i][j]=0;
                }
            }
        }
        
        //set the true col to 0
        for(int j = 0; j < n; j++){
            if(col[j]==true){//set ith col to zero
                for(int i = 0;i < m; i++){
                    arr[i][j]=0;
                }
            }
        }

    }
}