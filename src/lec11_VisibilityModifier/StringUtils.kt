package lec11_VisibilityModifier

// 파일 최상단에 util성 코드를 만들어주면 Java에서의 abstract class + private constructor를 사용하여 인스턴스화를 막는 것 처럼 사용할 수 있다.
fun isDirectoryPath(path: String): Boolean{
    return path.endsWith("/")
}