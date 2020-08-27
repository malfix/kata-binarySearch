class BinarySearch(private vararg val array: Int) {
    fun find(value: Int): Boolean = foundOn(0, array.size - 1, value)

    private fun foundOn(left: Int, right: Int, value: Int): Boolean =
            calculateCenter(left, right).let { idx ->
                 when {
                    left > right -> false
                    array[idx] < value -> foundOn(idx + 1, right, value)
                    array[idx] > value -> foundOn(left, idx - 1, value)
                    else -> true
                }
            }

    private fun calculateCenter(left: Int, right: Int): Int = (left + right) / 2
}