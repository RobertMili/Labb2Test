import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;


public class FileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Fruit> fruitList = getPeople(sc);

    }

    private static void readingFruitTest(ArrayList<Fruit> fruitArrayList) {
        String homeFolder = System.getProperty("user.home");
        //System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        //System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "FruitFolderTEST.txt");

        Scanner s = null;
        try {
            s = new Scanner(new File(String.valueOf(filePath)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> list = new ArrayList<>();
        while (s.hasNextLine()) {
//            list.stream()
//                    .filter(d -> !d.startsWith("="));
            list.add(s.nextLine());

        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
//        for (String lista : list) {
//            System.out.println(lista);
//        }
    }

    private static void savingFruitFolder(ArrayList<Fruit> fruitList) {
        String homeFolder = System.getProperty("user.home");
        //System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        //System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "FruitFolderTEST.txt");
        //System.out.println(filePath);

        //System.out.println(Files.exists(filePath));

        for (Fruit fruit : fruitList) {
            try {
                if (!Files.exists(filePath)){
                    Files.createFile(filePath);
                    System.out.println("Creating new Folder");
                }
                Files.writeString(filePath, fruit + System.lineSeparator(), StandardOpenOption.APPEND);
                System.out.println(filePath);

            } catch (FileAlreadyExistsException e) {
                System.out.println("File already exists: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e.getClass().getName() + " " + e.getMessage());
            }
        }
    }
    private static ArrayList<Fruit> getPeople(Scanner sc) {
        ArrayList<Fruit> test = new ArrayList<>();

        String test1 = sc.nextLine();
        int test2 = sc.nextInt();
        int test3 = sc.nextInt();

        test.add(new Fruit(test1, test2, test3));

        return test;
    }
}
//        for (Fruit fruit : fruitList){
//            System.out.println(fruit);
//        }