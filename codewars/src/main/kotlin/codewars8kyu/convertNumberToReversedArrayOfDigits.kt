object Kata {
    fun digitize(n:Long):IntArray {
        return n.toString()
            .reversed()
            .map { it.digitToInt() }
            .toIntArray()
    }
}