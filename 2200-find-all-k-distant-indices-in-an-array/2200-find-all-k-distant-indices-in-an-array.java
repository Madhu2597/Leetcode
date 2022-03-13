class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//         List<Integer> ans=new ArrayList<>();
//         if(nums.length==1){
//             ans.add(0);
//         }
//         for(int i=0;i<nums.length;i++){
//            // if(nums[i]==key){
//                 for(int j=i+1;j>=0;j--){
//                     if(nums[i] ==key && Math.abs(j-i)<=k){
//                         if(!ans.contains(j)&& ans.size()<nums.length)
//                             ans.add(j);
                        
//                     }
                
//             }
//         }
//         List<Integer> res=new ArrayList<>();
//         // Collections.sort(ans);
//         // int e=0;
//         // while(ans.size()>0){
//         //     res.add(ans.get(e));
//         //     e++;
//         // }
//         //return ans;
//         for(int i=0;i<ans.size();i++){
//             for(int j=i+1;j<ans.size();j++){
//                 if(ans.get(i)>ans.get(j)){
//                     int tmp=ans.get(i);
//                     ans.set(i,ans.get(j));
//                     ans.set(j,tmp);
//                 }
//             }
//         }
//         return ans;
        //flagging those who should be in result
        boolean flag[] = new boolean[1001];
        
		//O(N * K)
        for (int i = 0; i < nums.length; i++) {
            
            //if we found the key
            if (nums[i] == key) {
                
                //flag range  of (i - k, i + k)
                int j = i - k > 0 ? i - k : 0;
                for (; j <= i + k  && j < nums.length; j++) {
                    flag[j] =true;
                }
            }
        }
        
        //pack up
        //add flagged nums in list
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1001; i++) {
            if (flag[i]) {
                list.add(i);
        
            }
        }
        return list;

    }
}