public class MissingNumber {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,6};

        int expNoEle = arr.length + 1;

        int totalNum = expNoEle * (expNoEle + 1)/2;

        int sum =0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Missing number is "+ (totalNum - sum));
    }
}
