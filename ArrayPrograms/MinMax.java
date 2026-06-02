package ArrayPrograms;

public class MinMax {
    public static void main(String[] args) {
        
        int a[] = {10,7,8,99,65,22,70};
        
        int max = a[0];

        for(int i=1; i<a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("max value is: "+max);

        int min = a[0];

        for(int j=1; j<a.length;j++) {
            if(a[j] < min) {
                min = a[j];
            }
        }

        System.out.println("min value is: "+min);

    }

    
}
