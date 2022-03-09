class Solution {
    fun findMaxDistinct(input: String): Int {
        val charMap: HashMap<Char, Int> = HashMap<Char, Int>()
        var max = 0
        var idx = 0
        var accum = 0
        var preChar: Char = Char.MIN_VALUE
        for (ch in input) {
            idx++
            if (charMap.containsKey(ch)) {
                if (max <= accum) {
                    max = accum
                }
                if (preChar == ch) {
                    accum = 1
                    charMap.clear()
                }
            } else {
                accum++
            }
            charMap[ch] = idx
            preChar = ch
        }
        if (max <= accum) {
            max = accum
        }
        return max
    }
}

