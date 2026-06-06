class MissingNumber2 {
    
    static int findMissing(int arr[]) {

        int xor1 = 0;
        int xor2 = 0;

        for(int i=1; i<=arr.length+1; i++) {
            xor1 ^= i;
        }

        for(int num : arr) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8};

       int num =  findMissing(arr);

       System.out.println(num+" ");
    }
}