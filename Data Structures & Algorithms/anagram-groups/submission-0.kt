class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashmap = HashMap<List<Int>,MutableList<String>>()
        for(str in strs){
            val charcter = MutableList(26){0}
            for(c in str){
                charcter[c -'a']++
            }
           
            hashmap.getOrPut(charcter){mutableListOf() }.add(str)
            


        }
        return hashmap.values.toList()
    }
}
