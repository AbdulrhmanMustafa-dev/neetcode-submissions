class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashmap = HashMap<String, MutableList<String>> ()
        for(str in strs){
            val sortStr = str.toCharArray().sorted().joinToString("")
            hashmap.getOrPut(sortStr){mutableListOf()}.add(str)
        }
        return hashmap.values.toList()
    }
}
