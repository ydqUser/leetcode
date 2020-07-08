/**
 * author:YangDaQiang
 * Date:2020/7/8
 * Time:16:54
 */
public class Solution {

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
			for (int j = i+1; j < nums.length; j++) {
				if (i == j){
					break;
				}
				if (target == nums[i] + nums[j]){
					return new int[]{i,j};
				}
			}
		}
		return ints;
	}
	//整数反转
	public static int reverse(int x) {
		int rev = 0;
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;

		while(x != 0) {
			int pop = x % 10;   // 取得余数
			x /= 10;           //进行去位
			//判断是否正溢出
			if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
				return 0;
			}
			//判断是否负溢出
			if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
				return 0;
			}

			rev = rev * 10 + pop;    //求出反转整数
		}

		return rev;
	}

	//回文数
	public static boolean isPalindrome(int x) {
		int a = x;
		int rev = 0;

		while(x > 0) {
			int pop = x % 10;   // 取得余数
			x /= 10;           //进行去位

			rev = rev * 10 + pop;    //求出反转整数
		}
		if (a == rev) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
}