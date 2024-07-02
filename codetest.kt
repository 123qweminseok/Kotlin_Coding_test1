// 여러 이메일이 담긴 리스트가 있어요!
// 저는 구글로 가입한 사람과 네이버로 가입한 사람의 숫자와
// 그 외의 기메일로 가입한 사람의 숫자를 보고 싶습니다.
// @와 .을 기준으로 어느 사이트에서 들어온 사람들인지 구분을 합니다.
// 아래와 같은 함수를 만들어보세요.

fun main(){

    val emailList1 = arrayListOf<String>("jay@naver.com",
        "john@naver.com",
        "emily@google.com",
        "ken@google.com",
        "minjun@kakao.com")
    val result1 = solution(emailList1)
    println(result1)
    // 결과값 = {naver=2, google=2, else=1}

    val emailList2 = arrayListOf<String>("Aiden@naver.com",
        "Andew@naver.com",
        "Adrian@daum.com",
        "Asher@google.com",
        "Austin@kakao.com",
        "Antonio@google.com")
    val result2 = solution(emailList2)
    println(result2)
    // 결과값 = {naver=2, google=2, else=2}

}

fun solution(emailList: ArrayList<String>) :Map<String, Int> {
    //반환타입이 Map 즉 String,Int니까return시에도 String,Int로 해야지
    //1.구분을 해야하니 split을 써서 @로 나눈것들을 따로 저장하고 이제 startWith로 아님 endsWidh로 하면 됨
    val splitlist=ArrayList<String>()//변수 초기화 ㅇㅇ 배열이 들어갔다고 하는것. 지금은 아무값도 없겠지

    for(a in emailList){//for문으로 요소 하나하나에 접근한다.
        val parts=a.split("@") //끊어진 여러 값들이 존재함. 한번에 add로 안됨 Aiden,naver.com 존재하는데 이게 리턴이 "배열" 로된다.
        ///ArrayList의 add 메서드는 요소를 추가할 때 단일 요소만 추가할 수 있다. 배열 자체를 add로 추가할수는 없다 그래서 addAll하면 다 저정되긴 함.
            if(true){
                splitlist.add(parts[1])//이러면 짜피 두번째 naver.com ,kakao.com만 들어감
            }
    } //추가까지 다 끝내고
  var naver=0;
    var google=0;
    var count2=0;
    for(i in splitlist){

        if(i=="naver.com"){
            naver++
        }
        if(i=="google.com")
        {
            google++
        }else {
            count2++
        }
    //여기까지 다 추가하고
    }
var map= mutableMapOf<String,Int>()//map객체 생성
    map.put("naver",naver)
    map.put("google",google)
    map.put("else",count2)
return map

}


//코틀린에서 함수의 반환 타입이 명시되어 있지 않고, 함수가 어떤 값을 반환하지 않는 경우, 함수는 암묵적으로 Unit을 반환합니다. kotlin.Unit이거 반환함.ㄴ