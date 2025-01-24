package January;

// Check if All Characters Have Equal Number of Occurrences
public class p24jan1 {
    public static void main(String[] args) {
        String s = "aaddvv";
        int[] freq = new int[26]; // Using array because you're not using maps

        // Step 1: Count frequencies of each character in the string
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find the frequency of the first non-zero character
        int targetFreq = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) { // Find the first non-zero frequency
                targetFreq = freq[i];
                break;
            }
        }

        // Step 3: Check if all non-zero frequencies are the same
        boolean isEqual = true; // Assume all frequencies are equal initially
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0 && freq[i] != targetFreq) { // Mismatch found
                isEqual = false;
                break;
            }
        }

        // Final Output
        if (isEqual) {
            System.out.println("All characters have equal occurrences.");
        } else {
            System.out.println("All characters do NOT have equal occurrences.");
        }
    }
}