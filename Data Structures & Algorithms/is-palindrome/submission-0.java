class Solution {

    public boolean isPalindrome(String S) {

        // Convert to lowercase and remove non-alphanumeric chars
        String s = S.toLowerCase().replaceAll("[^a-z0-9]", "");

        return check(s, 0);
    }

    boolean check(String s, int i) {

        // Base condition
        if (i >= s.length() / 2) {
            return true;
        }

        // Mismatch found
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        // Recursive call
        return check(s, i + 1);
    }
}