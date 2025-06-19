package two_pointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
   Here we are trying to find a pair of numbers matching to a given sum
   Ex: [1,2,4,5] sum = 8, result: No
       [1,2,4,4,5] sum = 8, result: yes (4+4)
   The current approach takes quadratic time with two loops
 */
public class BruteForce {
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
        for(int i = 0; i<list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == sum) {
                    x = 0;
                    break;
                }
            }
        }
        if(x==-1){
            System.out.println("No");
        }
        else
            System.out.println("Yes");

    }
}
