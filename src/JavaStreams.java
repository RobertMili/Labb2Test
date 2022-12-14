import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;


public class JavaStreams {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Fruit> people = getPeople();
        //people.forEach(System.out::println);
        //String search = sc.nextLine();



        String homeFolder = System.getProperty("user.home");
        System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "RobertLaboratory.txt");
        System.out.println(filePath);

        System.out.println(Files.exists(filePath));


//        for (Fruit str : people) {
//            try {
//                Files.writeString(filePath, str + System.lineSeparator(), StandardOpenOption.APPEND);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        for (Fruit str : people) {
            try {
                //Files.createFile(filePath);
                Files.writeString(filePath, str + System.lineSeparator());

                String fileContent = Files.readString(filePath);
                System.out.println(fileContent);

            } catch (FileAlreadyExistsException e) {
                System.out.println("File already exists: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e.getClass().getName() + " " + e.getMessage());
            }
        }
       // Scanner s = null;
//        try {
//            s = new Scanner(new File(String.valueOf(filePath)));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        ArrayList<String> list = new ArrayList<>();
//        while (s.hasNext()){
////            list.stream()
////                    .filter(d -> !d.startsWith("="));
//            list.add(s.next());
//
//
//
//        }
//        s.close();
//
//        System.out.println(list.toString());
//        people.forEach(i -> {
//            if (!i.getName().equals(search)) {
//                people.stream();
//
//                System.out.println("The " + search + " you are looking for do not exist");
//
//
//            } else {
//
//                people.stream().limit(1).forEach(System.out::println);
//            }
//        });

    }
        private static ArrayList<Fruit> getPeople() {
            ArrayList<Fruit> test = new ArrayList<>();
            test.add(new Fruit("test", 12,123));
            test.add(new Fruit("test", 12,123));
            test.add(new Fruit("test", 12,123));
            test.add(new Fruit("test", 12,1));



            return test;
        }
//
//        people.forEach(System.out::println);
//
//
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
////
//        var nameLengthOfObject = nameLength;
//        int prisLengthOfObject = Integer.parseInt(prisLenght);
//        int  eanLengthObject = Integer.parseInt(eanLenght);
//        var sumOfObjectLenth = nameLengthOfObject + prisLengthOfObject + eanLengthObject;
//
//
//        int lengthWithOutObjectLength = 23;
//        xPlacer("=".repeat(sumOfObjectLenth + lengthWithOutObjectLength));



//
//       people.forEach(i -> {
//            if (!i.getName().equals(search)) {
//                people.toString();
//
//                System.out.println("The " + search + " you are looking for do not exist");
//
//            } else {
//
//                people.stream().limit(1).forEach(System.out::println);
//            }
//        });
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
