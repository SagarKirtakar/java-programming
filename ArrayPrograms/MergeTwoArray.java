package ArrayPrograms;

public class MergeTwoArray {
    public static void main(String[] args) {
        
        int num1[] = {1,2,3,4,5};

        int num2[] = {6,7,8,9,10};

        int num1_len = num1.length;

        int num2_len = num2.length;

        int num3_len = num1_len + num2_len;

        int num3[] = new int[num3_len];

        for(int i=0; i<num1.length; i++) {
            num3[i] = num1[i];
        }

        for(int i=0; i<num2.length; i++) {
            num3[num1.length+i] = num2[i];
        }


        for(int i=0; i<num3.length; i++) {
            System.out.println(num3[i]);
        }

    }
    
}
