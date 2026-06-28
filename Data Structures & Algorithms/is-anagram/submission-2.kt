class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val s1 = s.toCharArray().sorted()
        val t1 = t.toCharArray().sorted()
        if(s1 == t1){
            return true
        }else{
            return false
        }
    }
}
