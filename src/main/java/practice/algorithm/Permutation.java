package practice.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
  public static void main(String[] args) {
    //
    int[] nums = {1, 2, 3};
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> tempList = new ArrayList<>();
    new Permutation().backtrack(list, tempList, nums);
  }

  private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
    if (tempList.size() == nums.length) {
      list.add(new ArrayList<>(tempList));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (tempList.contains(nums[i])) continue;
        tempList.add(nums[i]);
        backtrack(list, tempList, nums);
        tempList.remove(tempList.size() - 1);
      }
    }
  }
}
