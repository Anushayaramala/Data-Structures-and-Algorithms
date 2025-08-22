public class ContainerWithMostWater {
    

    public int maxArea(int[] height) {
        int left=0;
        int right=height.length - 1;
        int maxArea=0;
        while(left<right){
            
            int h = Math.min(height[left],height[right]);
            int area =h*(right-left);
            maxArea = Math.max(maxArea,area);
            while (left < right && height[left] <= h) left++;
            while (left < right && height[right] <= h) right--;
         
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7}; // Example heights
        int maxArea = container.maxArea(height);
        
        System.out.println("Maximum area: " + maxArea);
    }
}