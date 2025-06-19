package two_pointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
   Here we are trying to find a pair of numbers matching to a given sum
   Ex: [1,2,4,5] sum = 8, result: No
       [1,2,4,4,5] sum = 8, result: yes (4+4)
   The optimal solutions:
        1. Assuming the list is sorted. Have two pointers from starting and ending
            add the numbers. If the sum is greater than the target that means we have to move the ending pointer back
            and vice versa. This approach takes linear time.
        2. If the list is unsorted, search if a complement exists
            Ex: 1, complement of 1 to get sum 8 is 7, so search for 7 in the list.
            This approach takes (n log n) time.
        3. Let us optimize it further. If look up can be constant instead of log n then we can end up in linear time.
           So add each element to hash set, check for their complements.
 */
public class OptimalSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter target sum");
        int sum = obj.nextInt();
        System.out.println("Enter number of elements");
        int n = obj.nextInt();
        System.out.println("enter " + n + " numbers");
        for(int i = 0; i<n; i++){
            list.add(obj.nextInt());
        }
        int x = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int l: list){
            if(set.contains(sum-l)){
                System.out.println("yes");
                x = 0;
                break;
            }
            set.add(l);
        }
        if (x==-1) System.out.println("No");
    }
}
