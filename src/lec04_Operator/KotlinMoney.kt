package lec04_Operator

data class KotlinMoney(
    val amount: Long
)  {
    operator fun plus(other: KotlinMoney): KotlinMoney{ // 연산자 오버로딩
        return KotlinMoney(this.amount+other.amount)
    }
}

