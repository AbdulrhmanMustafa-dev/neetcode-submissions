class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val nums = IntArray(26)
        for(i in s.indices){
            nums[s[i] -'a']++
            nums[t[i]-'a']--
        }
        for(i in nums){
            if (i!= 0 ) return false
        }
        return true
    }
}
