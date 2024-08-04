function solution(num_list) {
    let answer = 0;
    let length = num_list.length;
    
    let s1 = 0; // 원소의 합
    
    num_list.forEach((num)=>{
        s1 += num;
    })
    
    let s2 = 1; // 원소의 곱 => 0이면 곱해도 항상 0에 수렴하므로
    
    num_list.forEach((num)=>{
        s2 *= num;
    })
    
    
    if(length >= 11){
       answer = s1;
    }else if(length <= 10){
        answer = s2;
    }
    
    
    return answer;
}