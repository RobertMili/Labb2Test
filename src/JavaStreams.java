import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;


public class JavaStreams {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<Fruit> people = getPeople();


        String search = sc.nextLine();

       people.forEach(i -> {
            if (!i.getName().equals(search)) {
                people.toString();

                System.out.println("The " + search + " you are looking for do not exist");

            } else {

                people.stream().limit(1).forEach(System.out::println);
            }
        });

    }


//
//        int nameLength = people.stream()
//                .sorted(Comparator.comparing(Fruit::getName))
//                .mapToInt(i -> i.getName().length())
//                .reduce((first, second) -> second)
//                .getAsInt();
//
//        String prisLenght = String.valueOf(people.stream()
//                .sorted(Comparator.comparing(Fruit::getPris))
//                .map(i -> String.valueOf(i.getPris()))
//                .reduce((first, second) -> second)
//                .stream().mapToInt(i -> i.length()).sum());
//
//        String eanLenght = String.valueOf(people.stream()
//                .sorted(Comparator.comparing(Fruit::getIdkod))
//                .map(i -> String.valueOf(i.getIdkod()))
//                .reduce((first, second) -> second)
//                .stream().mapToInt(i -> i.length()).sum());
//
//
//        var nameLengthOfObject = nameLength;
//        int prisLengthOfObject = Integer.parseInt(prisLenght);
//        int  eanLengthObject = Integer.parseInt(eanLenght);
//        var sumOfObjectLenth = nameLengthOfObject + prisLengthOfObject + eanLengthObject;
//
//
//        int lengthWithOutObjectLength = 23;
//        xPlacer("=".repeat(sumOfObjectLenth + lengthWithOutObjectLength));
//

//        int total = 0;
//        for (Fruit sublist : people){
//            total += sublist.size(2);
//
//        }
//        System.out.println(total);

//        for (int i = 0; i < total; i++) {
//            System.out.print("==");
//        }
//        System.out.print("1");


//
//
//        try {
//            String scanner2 = sc.nextLine();
//
//            Fruit removeObject = people.stream()
//                    .filter(i -> i.getName().equals(scanner2))
//                    .reduce((first, second) -> second)
//                    .get();
//
//            people.remove(removeObject);
//            people.forEach(System.out::println);
//        }catch (Exception e){
//            System.out.println("Nothing");
//        }


//        try {
//            int search = sc.nextInt();
//
//            meatList.forEach(i -> {
//                if (i.getIdkod() != search) {
//                    System.out.println("The " + search + " EAN you are looking for do not exist");
//                } else {
//                    meatList.forEach(System.out::println);
//                }
//            });
//        }catch (Exception e){
//            System.out.println("The price you are looking for do not exist");
//        }
//
//
//        people.forEach(p -> {
//            if (!p.getName().equals(scanner2)) {
//                System.out.println("The product you are looking for do not exist");
//            } else {
//                people.forEach(System.out::println);
//            }
//        });


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





     public static boolean match (ArrayList<Fruit> list, String input) {
        return list.stream().anyMatch(s -> s.equals(input));

    }
    private static void xPlacer(String hour) {
        System.out.print(hour);
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
        test.add(new Fruit("test", 12,123));
        test.add(new Fruit("test", 12,123));
        test.add(new Fruit("testasdasasdasas", 12,1235661231));



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
