import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;


public class JavaStreams {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //Instantiating an ArrayList object

        String scanner2 = sc.nextLine();

        ArrayList<Fruit> people = getPeople();

        people.forEach(p -> {
            if (!p.getName().equals(scanner2)) {
                System.out.println("The product you are looking for do not exist");
            } else {
                people.forEach(System.out::println);
            }
        });

//        try {
//            List<Fruit> femel = people.stream()
//                    .filter(person -> person.getName().equals(scanner2))
//                    .findAny()
//                    .orElseThrow();
//
//            femel.forEach(System.out::println);
//
//        }catch(NoSuchElementException e){
//            System.out.println("Nothing");
//        }



//        if(match(people, scanner2))
//        {
//            List<Fruit> fruits = people.stream()
//                    .filter(person -> person.getName().equals(scanner2))
//                    .toList();
//            fruits.forEach(System.out::println);
//        } else {
//            System.out.println("Nothing");
//        }




    } public static boolean match (ArrayList<Fruit> list, String input) {
        return list.stream().anyMatch(s -> s.equals(input));

    }
//
//            people.stream().forEach(i -> {
//            if (i.getName().equals(scanner2)){
//                fruits.forEach(System.out::println);
//            }else{
//                System.out.println("Nothing");
//            }
//
//            }
//        );
//
//        public static Consumer<? super Fruit> printOut(){
//            System.out.println("Nothing");
//           return null;
//        }


    private static ArrayList<Fruit> getPeople() {
        ArrayList<Fruit> test = new ArrayList<>();
        test.add(new Fruit("test", 12,123));

       return test;
    }
    public static Consumer<? super Fruit> test(){
        System.out.println("TEst");
        return null;
    }
    public static void searchingNotJavaStream(){
        //
//        for(Fruit fruit : fruitList) {
//            if (fruit.getName() != null && fruit.getName().contains(search)) {
//                System.out.println(fruit.getName() + " prise: " + fruit.getPris() + " EAN : " + fruit.getIdkod());
//            } else {
//                System.out.println("The product you are looking for do not exist");
//            }
//        }
    }
}
