package lec10_inheritance.Kotlin

import javax.management.monitor.StringMonitor

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 프로퍼티를 override 할 때 무조건 open을 붙여 줘야 한다.
) {
    abstract fun move() // 추상 메소드가 아닌 메소드는 final 접근자이다.
}