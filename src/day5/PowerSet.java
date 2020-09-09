package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PowerSet {
	
	 static List<List<Integer>> myPowerSet = new ArrayList<List<Integer>>();
	 public static List<List<Integer>> subsets(int[] nums) {
		 List<Integer> one = new ArrayList<>();
		 Collection<? extends Integer> a1 = null;
		 one.addAll(a1);
		 subsets(nums, one);
		 
		 
		 return myPowerSet;
		
	     
	 
	 }
	 
	 public static void subsets(int[] nums, List<Integer> prefix) {
		 
		 for(int i=0; i<nums.length ; i++) {
			 List<Integer> tempPrefix = prefix;
			 tempPrefix.add(nums[i]);
			 
			 myPowerSet.add(tempPrefix);
			 
			 subsets(Arrays.copyOfRange(nums, i+1, nums.length), tempPrefix);
			 
		 }
		 
	 }	 
	

}
