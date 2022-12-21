import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long appealSum(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) >= 2) {
                if (nums[i] > nums[i + 1]) {
                    nums[i]--;
                    nums[i + 1]++;
                } else {
                    nums[i]++;
                    nums[i + 1]--;
                }
                i = 1;
            }
            return Arrays.stream(nums).max().orElse(0);
        }
return 0;

        }
    private List<String> returnMostPopularCreators(Map<String, Integer> map) {
        int maxValue = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get().getValue();
        List<String> topCreators = map.entrySet().stream().filter((Map.Entry<String, Integer> entry) -> entry.getValue() == maxValue).
                map(Map.Entry::getKey).
                collect(Collectors.toList());
        return topCreators;
        return null;
    }
    }
}