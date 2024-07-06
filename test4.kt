// 리스트에 있는 숫자들을 모두 더한 후
// 리스트의 갯수로 나눈 값을 출력하는 solution을 만드세요

fun main(){

    val arr1 = arrayListOf<String>("1", "2")

    val result1 = solution1(arr1)
    println(result1)
    // 1.5

    val arr2 = arrayListOf<String>("1", "2", "3", "4", "5")
    val result2 = solution1(arr2)
    println(result2)
    // 3.0


}


fun solution1(arr: ArrayList<String>): Double {

    var sum=0.0;
    var return1=0.0;
for (a in arr){
    var ab=a.toDouble()

    sum=sum+ab//더해 sum에 들어오는 전부
var arrsize=arr.size //int

    return1=sum/arrsize
}

return return1.toDouble()
}
//코틀린에서는 배열, 컬렉션의 갯수 즉 크기를 구할때는 size로 한다.!!