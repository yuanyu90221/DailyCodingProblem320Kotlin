class Solution {
    fun findMaxDistinct(input: String): Int {
        val charMap: HashMap<Char, Int> = HashMap<Char, Int>()
        var max = 0
        var idx = 0
        var accum = 0
        for (ch in input) {
            idx++
            if (charMap.containsKey(ch)) {
                if (max <= accum) {
                    max = accum
                }
            } else {
                accum++
            }
            charMap[ch] = idx
        }
        return max
    }
}

