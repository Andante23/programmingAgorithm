class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        // arr1 , arr2 배열 모든 원소의 합들을 각각  s1 , s2
        
        int s1 = 0; 
        int s2 = 0;
        
         for(int i = 0 ; i<arr1.length ; i++){
             s1 += arr1[i];
         } // arr1
        
        
         for(int j = 0 ; j<arr2.length ; j++){
             s2 += arr2[j];
         } // arr2
        
        
        if(arr1.length != arr2.length){
            if(arr1.length < arr2.length){
                return -1;
            }else if(arr1.length > arr2.length){
                return 1;
            }else if(arr1.length == arr2.length){
                return 0;
            }
        }else if(arr1.length == arr2.length){
               if(s1 != s2){
                   if(s1 > s2){
                          return 1;
                   }else if(s1 < s2){
                       return -1;
                   }else if(s1 == s2){
                       return 0;
                   }
               }
        }
        
        
        
        
        return answer;
    }
}