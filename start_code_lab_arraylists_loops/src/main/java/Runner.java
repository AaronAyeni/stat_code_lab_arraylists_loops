import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Islay");
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");

        System.out.println("The index of the element Skye in ArrayList is: " +
                scottishIslands.indexOf("Skye"));

        scottishIslands.remove("Tresco");
        scottishIslands.remove(5);

        int size = scottishIslands.size();
        System.out.println("Number of islands in list: " + size);

        System.out.println("Before sorting: " + scottishIslands);
        Collections.sort(scottishIslands);
        System.out.println("After sorting: " + scottishIslands);

        for (int i = 0; i < scottishIslands.size(); i++) {
            System.out.println(scottishIslands.get(i));
        }

//        1. Add "Coll" to the end of the list   Done
//        2. Add "Tiree" to the start of the list   Done
//        3. Add "Islay" after "Jura" and before "Mull"  Done
//        4. Print out the index position of "Skye"   Done
//        5. Remove "Tresco" from the list by name    Done
//        6. Remove "Arran" from the list by index   Done
//        7. Print the number of islands in your arraylist Done
//        8. Sort the list alphabetically             Done
//        9. Print out all the islands using a for loop  Done


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println("An even number in the given array is: " + numbers.get(i));
            }
        }

        Collections.sort(numbers);
        int max = numbers.get(10);
        int min = numbers.get(0);
        for (int j : numbers) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println(max - min);

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                System.out.println(String.valueOf(true));
            }
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum: " + sum);



        int newSum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) != 13){
                newSum += numbers.get(i);
            } else {
                i++;
            }
        }
        System.out.println("NewSum: " + newSum);
//        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers                        Done
//        2. Print the difference between the largest and smallest value  Done
//        3. Print True if the list contains a 1 next to a 1 somewhere.   Done
//        4. Print the sum of the numbers,                                Done
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.   Done
//
//          So [2, 7, 13, 2] would have sum of 9.




    }
}