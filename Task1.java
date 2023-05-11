package JavaWork.JavaHomeWork.JavaHomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(7);
        nums.add(5);
        nums.add(3);
        nums.add(22);
        nums.add(12);
        System.out.println(nums);

        for (int i = 0, n = nums.size(); i < n; i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i--);
                n--;
            }
        }
        System.out.println(nums);
    }
}
