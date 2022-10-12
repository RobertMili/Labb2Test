import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class TestinForLoop {
    public static void main(String[] args) {

        ArrayList<Fruit> fruitArrayList = getPeople();
        savingFruitFolder(fruitArrayList);

        readingFoleder(fruitArrayList);


    }

    private static void readingFoleder(ArrayList<Fruit> fruitArrayList) {
        String homeFolder = System.getProperty("user.home");
        //System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        //System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "FruitFolder.txt");

        Scanner s = null;
        try {
            s = new Scanner(new File(String.valueOf(filePath)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> list = new ArrayList<>();
        while (s.hasNext()) {
//            list.stream()
//                    .filter(d -> !d.startsWith("="));
            list.add(s.next());

        }
        s.close();
//       for (String LP : list) {
//           System.out.println(LP);

//       }
        int counting = 0;

                    String listProduct = String.valueOf(list.get(0));
                    int listPris = Integer.parseInt(list.get(1));
                    int listEAN = Integer.parseInt(list.get(2));




        fruitArrayList.add(new Fruit(listProduct, listPris, listEAN));

        for (Fruit fruit : fruitArrayList) {
            System.out.println("Produkt: " + counting++ + " -> " + fruit);
        }
                }


    private static ArrayList<Fruit> getPeople() {
        int counting = 0;

        ArrayList<Fruit> test = new ArrayList<>();
        test.add(new Fruit("test", 12, 123));
        test.add(new Fruit("test", 12, 123));
        test.add(new Fruit("test", 12, 123));
        test.add(new Fruit("test", 12, 1));


        for (Fruit fruit : test) {
            System.out.println("Produkt: " + counting++ + " -> " + fruit);

        }
        return test;
    }
    private static void savingFruitFolder(ArrayList<Fruit> fruitList) {
        String homeFolder = System.getProperty("user.home");
        //System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        //System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "FruitFolder.txt");
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
}

//        for (int i = 0; i <=9; i = i + 3) {
//                System.out.println(i);
//                }
//                for (int i = 1; i <=9; i = i + 3) {
//                System.out.println(i);
//                }
//                for (int i = 2; i <=9; i = i + 3) {
//                System.out.println(i);
//                }