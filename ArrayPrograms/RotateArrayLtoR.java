

public class RotateArrayLtoR {
    
    public static void rotate(int arr[]) {
        int n = arr.length;

        int first = arr[0];

        for(int i=1; i<n; i++) {
               arr[i-1] =  arr[i];
        }
        arr[n-1] = first;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
        rotate(arr);

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
