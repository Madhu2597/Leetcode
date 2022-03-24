class Solution {
    // class myComparator implements comparator<Interval> {
    //     public int compare(Interval a,Interval b){
    //         return a.start-b.start;
    //     }
    // }
    // public boolean isOverlapping(Interval i, Interval j){
    //     return i.end>j.start;
    // }
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)
            return 0;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        LinkedList<int[]> res=new LinkedList<>();
        res.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            int[] curr=intervals[i];
            int[] last=res.getLast();
            if(last[1]>curr[0]){
                last[1]=Math.min(last[1],curr[1]);
                res.removeLast();
                res.add(last);
            }
            else{
                res.add(curr);
            }
        }
        return intervals.length-res.size();
        
    }
    
}