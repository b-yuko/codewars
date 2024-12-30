package codewars8kyu

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExample {

    // 問題：
    // 呼び出された階に最も近いエレベーターの名前（「left」/「right」）を返すはずです。
    // 両方のエレベータが呼び出された階から同じだけ離れている場合は、 右側のエレベータを選択する。
    // 入力は常に0〜2の有効な整数であると仮定してよい。

    @Test
    fun testFixed() {
        assertEquals("left", elevator(0,1,0))
        assertEquals("right", elevator(0,1,1))
        assertEquals("right", elevator(0,1,2))
        assertEquals("right", elevator(0,0,0))
        assertEquals("right", elevator(0,2,1))
    }
}


