import java.util.*;
public class Program4 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(0,nums,list);
        return list;
    }
    
    public static void helper(int ind,int[] nums,List<List<Integer>> list){
        if (ind  == nums.length){
            List<Integer> temp = new ArrayList<>();
            for (int i=0;i<nums.length;i++) temp.add(nums[i]);
			// add the temp list into main list
            list.add(temp);
            return;
        }
        
        for (int i=ind;i<nums.length;i++){
            swap(nums,ind,i);
            helper(ind+1,nums,list);
            swap(nums,ind,i);
            
        }
        
    }

    public static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void printList(List<List<Integer>> arr)
    {
        for (List<Integer> list : arr) {
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+ ",");
            }
            System.out.print("\b],");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] input1 = {1,2,3};
        List<List<Integer>> output1 = permute(input1);
        printList(output1);

        int[] input2 = {0,1};
        List<List<Integer>> output2 = permute(input2);
        printList(output2);

        int[] input3 = {1};
        List<List<Integer>> output3 = permute(input3);
        printList(output3);
    }
}
