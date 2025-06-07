class Solution {
    public int solution(int[] num_list) {
       int i = 0; int answer = 0; String chak = ""; String hol = "";
         for(i = 0 ; i< num_list.length ; i++){
             
             // 3 은 홀수 이므로 hol에 더해짐 
             // 4 는 짝수 이므로 chak에 더해짐
             
             if( num_list[i] % 2 == 0){
                 chak += num_list[i];
             }else if(num_list[i] % 2 !=0){
                 hol += num_list[i];
             }
             
             
         }
        
        answer = Integer.parseInt(chak) + Integer.parseInt(hol);
        return answer;
    }
}