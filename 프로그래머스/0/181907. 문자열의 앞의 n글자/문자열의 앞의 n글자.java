class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int count = 0; int i = 0;
        
        // 일단 my_string을  n만큼 순회를 돌리면되요. 순서가 있으니 -> for
        for(i=0 ; i< n ; i++){ 
            
            // 그리고 my_string의 앞의 인덱스인 0번이 첫번째 인덱스임
            // n번 인덱스까지 문자를 빼서 더할거임 -> charAt()이 필요함 
            answer += my_string.charAt(i); }
            
         
        // 문제에서 answer을 리턴(return)하라 함
        return answer;
    }
}
            
        
        
        
      
    
