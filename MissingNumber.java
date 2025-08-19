class MissingNumber{
    public int MissingNumber1(int[] a1,int n){
        int XOR1=0;
        int XOR2=0;
        int N=n-1;
        for(int i=0;i<N;i++){
            
            XOR2=XOR2^a1[i];
            XOR1=XOR1^(i+1);
            

        }
        
        XOR1=XOR1^N;
        
        return XOR1^XOR2;

    } 

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] arr = {1, 3, 4, 5}; // Example array with missing number
        int n = arr.length+1; // Size of the array should be n-1
        System.out.println("Missing Number: " + mn.MissingNumber1(arr, n));
    }

}