class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //hash_Map
        val hashmap = HashMap<Int,Int>()
        for((i,n) in nums.withIndex()){
            if(hashmap.containsKey((target-n))){
                return intArrayOf(hashmap[(target-n)]!!,i)
            }
            hashmap[n]=i

        }
     
        return intArrayOf()

    }
}
