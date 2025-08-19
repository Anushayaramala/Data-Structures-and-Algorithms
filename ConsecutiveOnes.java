public class ConsecutiveOnes {
   
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int count=0;
        for(int num:nums){
            if(num == 1){
                count++;
                
            }
            else{
                maxi=Math.max(maxi,count);
                count=0;
            }
        }
        maxi=Math.max(maxi,count);
        return maxi;
        
    }

    public static void main(String[] args) {
        ConsecutiveOnes co = new ConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1}; // Example array
        System.out.println("Max Consecutive Ones: " + co.findMaxConsecutiveOnes(nums));
    }
}

