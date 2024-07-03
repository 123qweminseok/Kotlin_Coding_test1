// 문자열의 숫자와 짝수(true)와 홀수(false)를 알려주는 solution을 만드세요

fun main(){

    val result1 = solution("abcd")
    println(result1)
    // [4, true]

    val result2 = solution("abcde")
    println(result2)
    // [5, false]
}

//애초에 함수 안에 있는건 지역변수로 단발사용임 ㅇㅇ 호출끝나면 다 사라지니까 메모리상에서
fun solution(str : String) : ArrayList<String> {
    var a= str.length
    var array= arrayListOf<String>()
//     ArrayList<String> fruits = new ArrayList<>();
    array.add(a.toString())//인덱스에 2추가되고  짜피 단발성이니까
    if(a%2==0){
        array.add("true")
    }
    else{
        array.add("false")
    }
    return array
}