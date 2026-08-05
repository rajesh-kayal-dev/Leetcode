class Solution {
    activitySelection(start, finish) {
        // code here
        let n = start.length;
        
        let rooms = [];
        
        for (let i = 0; i < n; i++) {
            rooms.push([start[i], finish[i]]);
        }
        
        rooms.sort((a, b)=> a[1] - b[1]);
        
        // pick fisrt room
        let count = 1;
        let lastFinishTime = rooms[0][1];
        
        for(let i = 1; i < n; i++){
            if(rooms[i][0] > lastFinishTime){
                count++;
                lastFinishTime = rooms[i][1];
            }
        }
        return count;
    }
}