package ArrayPrograms;

public class DuplicateUnsortArray {
    public static void main(String[] args) {

        int a[] = {7,3,5,1,3,4,1,6};

        // Sort array (descending order)
        for(int i=0; i<a.length-1; i++) {
            for(int j=0; j<a.length-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        int k = 0;
        int temp[] = new int[a.length];

        // Remove duplicates
        for(int i=0; i<a.length-1; i++) {
            if(a[i] != a[i+1]) {
                temp[k] = a[i];
                k++;
            }
        }

        // Add last element
        temp[k] = a[a.length-1];
        k++;

        // Print unique elements
        for(int i=0; i<k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}