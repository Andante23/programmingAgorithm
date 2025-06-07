class Solution {
    public int solution(int[] num_list) {
 
        int answer = 0 ; int s = 1; int sum = 0;
         for(int i = 0 ; i < num_list.length ; i++){
             sum += num_list[i];
             s *= num_list[i];
         }
        
        answer = s < sum * sum ? 1 : 0;
         
        return answer;
    }
}