package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException
// try catch finally 모두 Java와 동일하다.
fun parseIntOrThrow(str: String): Int{
    try {
        return str.toInt() // 기본 타입간의 형변환은 toType()을 사용한다.
    }catch (e: NumberFormatException){ // type이 뒤에 위치한다.
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다") // new를 사용하지 않고 포맷팅이 간결하다.
    }
}

fun parseIntOrThrowV2(str: String): Int?{
    // try catch도 하나의 Expression으로 취급하여 return할 수 있다.
    return try {
        str.toInt()
    }catch (e: NumberFormatException){
        null
    }
}

class FilePrinter {
    // throws를 사용하지 않아도 오류가 발생하지 않는다.
    // Kotlin에서는 Checked Exception과 UnChecked Exception을 구분하지 않는다.
    // 모든 예외는 Unchecked Exception이다.
    fun readFile(){
        val currentFile = File(".")
        val file = File(currentFile.absolutePath+"/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }
    // try with resources
    // 코틀린에서는 try with resources이 없고 대신 .use 를 사용한다. (코틀린의 언어적 특징을 활용해 close를 호출)
    fun readFileV2(path: String){
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}


