function solution(arr) {
    var answer = [];
    
    let leng = arr.length
    
    // 1. arr 순회
    for(let i = 0; i< leng; i++){
    
        //2 - 1  50보다 크거나 같은 짝수라면 
        if( 50 <= arr[i] && arr[i] % 2 === 0 ) {
            // 정수배열 answer에 대입
            answer.push(arr[i] / 2 );
    
        // 2 - 2 50보다 작은 홀수면
        }else if(50 > arr[i] && arr[i] % 2 !== 0){
            answer.push(arr[i] * 2);
        }else{  
            //=> 그외에 나머지 값들은요
            answer.push(arr[i])  
        }
    }
    
    return answer;
}