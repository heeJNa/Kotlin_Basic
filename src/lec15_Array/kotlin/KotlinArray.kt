package lec15_Array

fun main(){
    val array = arrayOf(100,200)
    array.plus(300)
    for(i in array.indices){ // 0부터 마지막 index까지의 range
        println("${i} ${array[i]}")
    }

    for ((idx,value) in array.withIndex()){ // 인덱스와 값을 한  번에 가져올 수 있다.
        println("${idx} ${value}")
    }
}