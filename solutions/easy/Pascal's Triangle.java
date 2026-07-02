// Title: Pascal's Triangle
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/pascal's-triangle/

        for(int i=0;i<numRows;i++){
            if(i==0){
                l.add(1);
                ans.add(l);
                continue;
            }
            for(j=0;j<i+1;j++){
                if(j%i==0){
                    l.add(1);
                }
            }
            ans.add(l);
        }
                l.add(t.get(j-1)+t.get(j));
                    continue;
        List<Integer> t;
            t=ans.get(ans.size()-1);
        int num,j;
        ();
        List<List<Integer>> ans =new ArrayList<>
    numRows) {
            List<Integer> l=new ArrayList<>();
        return ans;
    }
}
    public List<List<Integer>> generate(int 
class Solution {
