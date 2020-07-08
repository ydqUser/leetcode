/**
 * author:YangDaQiang
 * Date:2020/7/8
 * Time:16:54
 */
public class Solution {
	public static void main(String[] args) {

	}

	//跳水板问题
	public static int[] divingBoard(int shorter, int longer, int k) {

		int[] ints = new int[k + 1];
		if (k == 0){
			return new int[0];
		}else if (shorter == longer){
			return new int[]{shorter * k};
		}else {
			for (int i = 0; i < ints.length; i++) {
				ints[i] = shorter * (k-i) + longer * i;
				System.out.println(ints[i]);
			}
		}
		return ints;
	}
	//两数之和
	public static int[] twoSum(int[] nums, int target) {
		int[] ints = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length-1){
				break;
			}
			if (target == nums[i] + nums[i+1]){
				ints[0] = i;
				ints[1] = i+1;
			}
		}
		return ints;
	}
}