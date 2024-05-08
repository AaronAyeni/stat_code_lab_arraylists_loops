import java.util.HashMap;

public class MapPlayground {

    public static void main(String[] args) {

        HashMap<String, Integer> trainerHouseNumbers = new HashMap<>();//declared two data types. THe key as a string and the value as an integer

        trainerHouseNumbers.put("Colin", 16);// "Colin" is the String key and 16 is the Integer value
        trainerHouseNumbers.put("Zsolt", 45);
        trainerHouseNumbers.put("Thibyaa", 26);

        trainerHouseNumbers.put("Zsolt" , 57); // reassigns integer value for the String key "Zsolt"

        int trainerHouse = trainerHouseNumbers.get("Zsolt");// "Zsolt" is the object key that we get and assign to variable trainerHouse

        System.out.println(trainerHouseNumbers);
        System.out.println(trainerHouseNumbers.keySet()); // gives back the list of keys that you have already used

    }
}
