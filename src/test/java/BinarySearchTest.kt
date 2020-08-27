import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BinarySearchTest {

    private lateinit var bs: BinarySearch

    @Before
    fun setUp() {
        bs = BinarySearch(1, 2, 3, 5)
    }

    @Test
    fun foundOnLeftBound() {
        Assert.assertTrue(bs.find(1))
    }

    @Test
    fun foundInside() {
        Assert.assertTrue(bs.find(3))
    }

    @Test
    fun foundOnRightBound() {
        Assert.assertTrue(bs.find(5))
    }

    @Test
    fun notFoundLeftBound() {
        Assert.assertFalse(bs.find(0))
    }

    @Test
    fun notFoundInside() {
        Assert.assertFalse(bs.find(4))
    }

    @Test
    fun notFoundRightBound() {
        Assert.assertFalse(bs.find(10))
    }
}