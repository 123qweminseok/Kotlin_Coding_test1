//리스트의 숫자를 뒤집어서 반환하는 솔루션 만들기

    fun main(){

        val arr1=arrayListOf(1,2,3,4,5)
        val result1=solution(arr1)
        println(result1)
        val arr2= arrayListOf(2,4,6,8)
        val result2=solution(arr2)
        println(result2)


    }

    fun solution (arr:ArrayList<Int>): ArrayList <String> {
    //String타입으로 반환을 하구나

        var arr3= arrayListOf<String>()
        //return arr.toString() 이렇게 해버리면 단순한 문자열이 되어버린다. ArrayList가 아니라는 것이다. 각 요소를 String형태로 만들어야한다
        var arr4=arr.reversed() //요소들 다 뒤집기+ 새로운 리스트를 반환한다.
        var arr5=arr.reverse()//애초에 반환값 자체가 void라 arr5엔 아무것도 들어가지 않는다. unit들어가지.
        for( a in arr4 ){
            arr3.add(a.toString())//각 요소 안에 넣어줌.

        }

        return arr3
    }


//reversed로 요소들을 다 뒤집자! reverse()는 뭘 따로 저장시켜주는게 아니라 원본 리스트를 바꿔주는거다.! .add() 메서드와 같게 리턴값이 없는 메서드이다!