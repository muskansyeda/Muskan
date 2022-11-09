public class Program2 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] input1 = {1,8,6,2,5,4,8,3,7};
        int output1 = maxArea(input1);
        System.out.println(output1);

        int[] input2 = {1,1};
        int output2 = maxArea(input2);
        System.out.println(output2);
    }
}
