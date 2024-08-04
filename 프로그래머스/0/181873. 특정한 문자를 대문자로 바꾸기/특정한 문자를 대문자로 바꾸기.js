function solution(my_string, alp) {
    var answer = '';
    
    //=> my_string을 모두 순회를 하였을때  alp에 해당하는 모든 문자가 있다면 그것을 모두 대문자로 바꾸어라 
    answer = my_string.replaceAll(alp,alp.toUpperCase())
    return answer;
}