class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        answer = new int[n]; // 삽입 전에 answer배열 초기화
        for(int i = 0 ; i<n ; i++){ 
            answer[i] = num_list[i]; // num_list[i]값 삽입
        }
         // answer 리턴
        return answer;
    }
}