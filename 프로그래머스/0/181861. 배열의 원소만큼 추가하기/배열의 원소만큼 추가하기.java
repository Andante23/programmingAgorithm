class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        // 값이 차곡차곡히 들어간다 = 총길이 짐작가능 
        //  5 , 1 , 4   5 + 1 + 4 
        
        int totalSize = 0;
        
        for(int num:arr){
          totalSize += num;
        }
        
        // 총길이가 존재하는 배열 생성하기 
        answer = new int[totalSize];
        
        int index = 0;
        
        // arr의 앞에서부터 차례대로 원소가 들어가야하므로...
        for(int i = 0 ; i<arr.length ; i++){
            // 원소를 원소번 대입
              for(int j =1 ; j<=arr[i] ; j++){
                answer[index] = arr[i];
                  index++;
              }
        }
        
        
        
        
        return answer;
    }
}