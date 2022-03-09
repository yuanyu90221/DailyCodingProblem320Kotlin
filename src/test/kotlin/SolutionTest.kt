import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun findMaxDistinctExample1() {
        assertEquals(5, sol.findMaxDistinct("jiujitsu"))
    }
}