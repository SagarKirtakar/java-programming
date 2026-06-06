            /* Array rotation left to right */

class RotateAnArray {

    public static void leftRotate(int arr[]) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
             arr[i-1] =   arr[i];
        }

       arr[arr.length-1] =  temp;
    }

    static void rightRotate(int arr[]) {
        int temp = arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }   

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        rightRotate(arr);

        for ( int nums : arr) {
            System.out.print(nums+ " ");
        }


        System.out.println();
        
        // leftRotate(arr);

        // for ( int nums : arr) {
        //     System.out.print(nums+ " ");
        // }
    }

}