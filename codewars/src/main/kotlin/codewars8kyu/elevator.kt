package codewars8kyu
import kotlin.math.abs

fun elevator(left: Int, right: Int, call: Int): String {
    return if(abs(call - left) >= abs(call - right)) "right" else "left"
}

// abs() は()内の値を絶対値にするメソッド
