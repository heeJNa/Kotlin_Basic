package lec13_NestedClass

/*
        static을 사용하는                static을 사용하지 않는
           중첩 클래스                        중첩 클래스
     : 밖의 클래스 직접 참조 불가                     |
                                    ------------------------------------
                                    |               |                  |
                               내부 클래스         지역 클래스           익명 클래스
                       :밖의 클래 직접 참조 불가 :메소드 내부에 클래스를 정의  : 일회성 클래스
 */
// Kotlin에서는 기본적으로 바깥 클래스를 참조하지 않는다. 바깥 클래스를 참조하고 싶다면 inner 키워드를 추가한다
class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom(  // inner 키워드를 명시적으로 붙여줘야 바깥 클래스 참조 가능
        private val area: Double
    ) {
        val address: String
            get() = this@House.address // 바깥 클래스 참조 this@바깥클래스
    }
}