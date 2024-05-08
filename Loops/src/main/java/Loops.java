import java.util.ArrayList;
import java.util.List;

public class Loops {

    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();//declaring colours as "List" allows us to change the list type later. For now we declare it as an array list
        colours.add("red");
        colours.add("blue");
        colours.add("green");

//        //Enhanced For Loop
//        for (String colour: colours){
//            System.out.println(colour);//prints colours variable iterating through each value in each index
//        }

        List<String> filteredColours = new ArrayList<>();

        for (String colour : colours){
            if(colour.charAt(0) == 'r'){
                filteredColours.add(colour);

            }

        }
//        System.out.println(filteredColours);

//        CLASSIC FOR LOOP

//        int i = 0;

//        increment
//        System.out.println(i++);
//        System.out.println(i--);


        for (int i = 0; i < colours.size();i++){
//            System.out.println(colours.get(i));
        }



        List<Integer> numbers = new ArrayList<>();

//        for (int i = 0; i <= 10 ;i++){
//            numbers.add(i); // adds numbers into the ArrayList via iteration throgh the loop and the .add method

        for (int i = 10; i > 0 ;i--){
            if(i ==4){
                break; //breaks out of the loop
//                continue; //skips that specific iteration
            }
            numbers.add(i);
        }
        System.out.println(numbers);
    }


}
