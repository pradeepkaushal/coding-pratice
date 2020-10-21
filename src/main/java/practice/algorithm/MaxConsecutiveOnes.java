package practice.algorithm;

public class MaxConsecutiveOnes {

  public static void main(String[] args) {
    //
    MaxConsecutiveOnes main = new MaxConsecutiveOnes();
    int[] nums = {1,0,1,1,0,1};
    System.out.println(main.findMaxConsecutiveOnes(nums));
  }

  public int findMaxConsecutiveOnes(int[] nums) {
    int lastCount = 0;
    int currentCount = 0;
    for (int num : nums) {
      if (num == 1) {
        currentCount++;
      } else {
        if (lastCount < currentCount) {
          lastCount = currentCount;
        }
        currentCount = 0;
      }
    }
    return currentCount > lastCount ? currentCount : lastCount;
  }
}
