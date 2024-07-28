class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str1 = myString.toUpperCase();
        String str2 = pat.toUpperCase();
        
        
        if(str1.contains(str2)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}