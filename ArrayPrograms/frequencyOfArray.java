package ArrayPrograms;
 /*  Frequency of array elements */


import java.util.HashMap;

public class frequencyOfArray {

    public static void main(String[] args) {

        int arr[] = {1,2,8,1,5,2,8,5,4}; 

        HashMap<Integer, Integer> map = new HashMap<>();
        // {1,2} {2,2} {8,2} {5,2} {4,1}

        for(int num : arr) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }

        for(int key : map.keySet()) {
            System.out.println(key + "-> "+ map.get(key)+ " times" );
        }
    }
}