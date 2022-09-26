import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class JavaStreams {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //Instantiating an ArrayList object

        String scanner2 = sc.nextLine();

        ArrayList<Fruit> people = getPeople();


        List<Fruit> femel = people.stream()
                .filter(person -> person.getName().equals(scanner2))
                .collect(Collectors.toList());

        femel.forEach(System.out::println);



    }

    private static ArrayList<Fruit> getPeople() {
        ArrayList<Fruit> test = new ArrayList<>();
        test.add(new Fruit("test", 12,123));

       return test;
    }
}
