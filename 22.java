22. Generate Parentheses




A.

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        backTrack(ans,new StringBuilder(),0,0,n);
        return ans ;
    }
    public void backTrack(List<String> ans , StringBuilder cur , int o , int c , int max){

        if(cur.length() == max*2){
            ans.add(cur.toString());
            return ;
        }
        if(o < max){
            cur.append("(");
            backTrack(ans , cur , o+1 ,c ,max);
            cur.deleteCharAt(cur.length()-1);
        }
         if( c<o){
            cur.append(")");
            backTrack(ans , cur , o ,c+1 ,max);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}
