

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Instantiate the HashMap to group our anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert to char array and sort to create a unique key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            
            // The shortcut: Find/create the list for this key, then append string 's'
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(s);
        }
        
        // Wrap and return the grouped collections
        return new ArrayList<>(map.values());
    }
}
