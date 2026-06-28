class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
         val window = mutableSetOf<Int>()
        for(num in nums){
           
            if(window.contains(num)){
                return true
            }
             window.add(num)

        }
         return false
    }
}
