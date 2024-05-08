import java.sql.SQLOutput;
import java.util.ArrayList;//allows you to use array lists in your code

public class ListPlayground {

    public static void main(String[] args) {

        ArrayList <String> trainers = new ArrayList<>();//creates new array list which is empty called "trainers"

        trainers.add("Colin");//adds string "Colin" to the end of the array list
        trainers.add("Zsolt");//adds string "Zsolt" to the end of the array list
        trainers.add("Thibyaa");//adds string "Thinyaa" to the end of the array list
        trainers.add("Anna");//adds string "Anna" to the end of the array list

//        String firstTrainer = trainers.get(0);//get method used to assign arraylist first index value to firstTrainer variable
//
//
//
//        System.out.println(firstTrainer);
        trainers.remove(0); //removes index 0 from arrayList
        trainers.remove("Zsolt"); // removes "Zsolt string from arrayList

        System.out.println(trainers);
    }

}
