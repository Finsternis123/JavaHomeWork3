package JavaWork.JavaHomeWork.JavaHomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

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
		
        System.out.println("Max value is: " + Collections.max(nums));
        System.out.println("Min value is: " + Collections.min(nums));

        double result = 0;
        for (int i : nums){
            result += i;
        }
        System.out.println("Average value is: " + result / nums.size());
	}
}
