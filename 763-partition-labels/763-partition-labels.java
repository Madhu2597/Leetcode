class Solution {
    public List<Integer> partitionLabels(String s) {
                //1. Make hashmap of last occurence
        //HashMap<Character, Integer> map=new HashMap<>();
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //map.put(ch,i);
            arr[ch-'a']=i;
        }
        //2. solve using chaining technique
        List<Integer> res=new ArrayList<>();
        int prev=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //max=Math.max(max,map.get(ch));
            max=Math.max(max,arr[ch-'a']);
            if(max==i){
                res.add(i-prev+1);
                prev=i+1;
            }
        }
        return res;
    }
}