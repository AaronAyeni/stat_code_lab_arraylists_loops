public class ArraysPlayground {

    public static void main(String[] args) {

//        String[] trainers = {"Colin", "Zsolt", "Thibyaa"};
//
//        String firstTrainer = trainers[0];
//
//        System.out.println(firstTrainer);

        String[] trainers = new String[3];//creates an empty array with space for 3 values. THis cannot be changed later in the code.

        trainers[0] = "Colin";//assigns "Colin" to array position 0
        trainers[1] = "Zsolt";
        trainers[2] = "Thibyaa";

        trainers[0] = "Richard";//array values can be reassigned

        String firstTrainer = trainers[0];

        System.out.println(firstTrainer);

    }
}
