class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        // We need to have a two pointer system again
        // One will point at the number we are not including in calculation while the other iterates through the numbers that will. At no point should j = i.
        val n = nums.size
        val productArray = IntArray(n)

        if (nums.isEmpty()) {
            return IntArray(0)
        }

        productArray[0] = 1
        for (i in 1 until n) {
            productArray[i] = productArray[i - 1] * nums[i - 1]
        }

        var rightProduct = 1
        for (i in n - 1 downTo 0) {
            productArray[i] *= rightProduct
            rightProduct *= nums[i]
        }

        return productArray

        
    }
}
