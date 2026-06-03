package ArrayPrograms;

public class SecondLargest {
    public static void main(String[] args) {
        
        int num[] = {25,16,38,10,35,48,20,50};

        int max1; //38

        int max2; //25

        if(num[0] > num[1]) { // 25 > 16
            max1 = num[0];
            max2 = num[1];
        }else {
            max2 = num[0];
            max1 = num[1];
        }

        for(int i=2; i<num.length; i++) { // i=3
            if(num[i] > max1) {  // 10 > 38
                max2 = max1;
                max1 = num[i]; 
            }else if(num[i] > max2){
                max2 = num[i];
            }
        }

        System.out.println("First largest: "+max1); // 50

        System.out.println("Second largest: "+max2); // 48

        
    }
}
