
import java.util.List;
import java.util.Collections;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        if (nums == null || nums.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two numbers.");
        }

        // Sort the list in descending order
        Collections.sort(nums, Collections.reverseOrder());

        // Get the two largest numbers
        int max1 = nums.get(0);
        int max2 = nums.get(1);

        // Return their sum
        return max1 + max2;
        
    }
}