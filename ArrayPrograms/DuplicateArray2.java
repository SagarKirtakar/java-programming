package ArrayPrograms;

public class DuplicateArray {
    public static void main(String[] args) {
        
        int a[] = {7,3,5,1,3,4,1,6};

        for(int i=0; i<a.length-1; i++) {
            for(int j=1; j<a.length -1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        int temp [] = new int[a.length];

        int j=0;
       for(int i=0; i<a.length-1; i++) {
            if(a[i] != a[i+1]) {
                temp[j] = a[i];
                j++;
            }
       }

       for(int num : temp) {
        System.out.print(num);
       }

    }
}
