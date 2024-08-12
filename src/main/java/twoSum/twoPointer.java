package twoSum;
import java.util.*;

public class twoPointer {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        int l = 0, r = nums.length - 1;

        while (l < r) {
            int sum = arr[l][0] + arr[r][0];
            if (sum == target) {
                return new int[]{arr[l][1], arr[r][1]};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return null; // 해답이 없을 경우 null 반환
    }
}