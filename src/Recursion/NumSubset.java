package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NumSubset {

    public void solve(int[] arr, int ind, List<Integer> sub, List<List<Integer>> ans) {

        if (ind == arr.length) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        sub.add(arr[ind]);
        solve(arr, ind + 1, sub, ans);
        sub.remove(sub.size() - 1);
        solve(arr, ind + 1, sub, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        solve(nums, 0, sub, ans);

        return ans;
    }

    public static void main(String[] args) {

        NumSubset obj = new NumSubset();

        int nums[] = {1, 2, 3};

        List<List<Integer>> result = obj.subsets(nums);
        System.out.println(result);
    }
}
