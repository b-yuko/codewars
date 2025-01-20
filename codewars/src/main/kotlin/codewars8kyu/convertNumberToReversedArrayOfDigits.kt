package codewars8kyu

/*

Convert number to reversed array of digits
数値を桁ごとに分解して逆順の配列に変換する

Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
与えられた非負の数値について、その桁を逆順に並べた配列として返してください。

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]

*/

object Kata {
    fun digitize(n:Long):IntArray {
        return n.toString()
            .reversed()
            .map { it.digitToInt() }
            .toIntArray()
    }
}