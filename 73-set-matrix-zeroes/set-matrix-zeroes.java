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
        boolean zeroRow= false;
        boolean zeroCol = false;

        //check in zeroRow
        for(int j =0 ; j < n;j++){
            if(arr[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        
        //check in zeroCol
        for(int i =0 ; i < m;i++){
            if(arr[i][0]==0){
                zeroCol = true;
                break;
            }
        }

        //marking the particular row and column 
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        //set the true row to 0
        for(int i = 1; i < m; i++){
            if(arr[i][0]==0){//set ith row to zero
                for(int j = 1;j < n; j++){
                    arr[i][j]=0;
                }
            }
        }
        
        //set the true col to 0
        for(int j = 1; j < n; j++){
            if(arr[0][j]==0){//set ith col to zero
                for(int i = 1;i < m; i++){
                    arr[i][j]=0;
                }
            }
        }

        //set 0th row to zero
        if(zeroRow==true){
            for(int j =0 ; j < n;j++){
            arr[0][j]=0;
            }
        }
        //set 0th col to zero
        if(zeroCol==true){
            for(int i =0 ; i < m;i++){
            arr[i][0]=0;
            }
        }


    }
}