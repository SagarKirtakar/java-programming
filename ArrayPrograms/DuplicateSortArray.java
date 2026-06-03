                /*  Removes Duplicates from Sorted Array */

package ArrayPrograms;

import java.util.HashSet;

class DuplicateSortArray {

    public static void main(String[] args) {
        
        // 1st Way using temp array

        // int a[] = {1,2,2,3,4,5,5,6,7};

        // int temp[] = new int[a.length];

        // int j=0;

        // for(int i=0; i<a.length-1; i++) {

        //     if(a[i] != a[i+1]) {
        //         temp[j] = a[i];
        //         j++;
        //     }
        // }

        // temp[j] = a[a.length-1];

        // for(int i=0; i<temp.length-1; i++) {
        //     System.out.print(temp[i]+" ");
        // }

        // 2nd Way without using temp array

        //  int a[] = {1,2,2,3,4,5,5,6,7};

        // //  a[] = {1,2,3,4,5,6};

        //  int j=0;// 6

        // for(int i=0; i<a.length-1; i++) { // i = 7

        //     if(a[i] != a[i+1]) { // 7 != 
        //         a[j] = a[i]; // 
        //         j++;
        //     }
        // }

        // a[j] = a[a.length-1]; // 6 = 8 = 7

        // for(int i=0; i<=j; i++) {
        //     System.out.print(a[i]+" ");
        // }

        // 3rd Way using Hashset with sorted or unsorted array both working

        int a[] = {1,2,2,3,4,5,5,6,7};

        HashSet<Integer> hs = new HashSet<>(); // Hashset can't store duplicates value

        for(int i=0; i<a.length; i++) {

            hs.add(a[i]);
        }

        for(int num : hs) {
            System.out.print(num+" ");
        }

    }
}