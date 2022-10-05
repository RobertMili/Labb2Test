import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO change in addProduct to unComment
        // ta bort kolla upp
        // put try/catch in add
        // ta bort fixa med namn ta bort
        // searching printing 2 times

        ArrayList<Fruit> fruitList = new ArrayList<>();
        ArrayList<Meat> meatList = new ArrayList<>();

        boolean switching = true;
        while (switching) {
            mainMeny();
            String choice = sc.nextLine();

            switch (choice) {
                case "e", "E" -> {
                    System.out.println("exit");
                    switching = false;
                }
                case "1" -> {
                    products();
                    String choice2 = sc.nextLine();
                    if (choice2.equals("1")) {
                        addFruits(sc, fruitList);

                    } else if (choice2.equals("2")) {
                        addMeats(sc, meatList);
                    }
                }
                case "2" -> {
                    System.out.println("sökning genom namn");
                    products();
                    String choice3 = sc.nextLine();
                    if (choice3.equals("1")) {
                        System.out.print("Sökning fruit: ");
                        searchingFruitsNamn(sc, fruitList);

                    } else if (choice3.equals("2")) {
                        System.out.print("Sökning kött: ");
                        searchingMeatsNamn(sc, meatList);

                    }
                }
                case "3" -> {
                    System.out.println("Sökning genom pris");
                    products();
                    String choice4 = sc.nextLine();
                    if (choice4.equals("1")) {
                        searchingFruitPrices(sc, fruitList);

                    } else if (choice4.equals("2")) {
                        searchingMeatPrices(sc, meatList);

                    }
                }
                case "4" -> {
                    System.out.println("Sökning genom prisintervall");
                    products();
                    String choice4 = sc.nextLine();
                    if (choice4.equals("1")) {
                        searchingFruitsPriceRange(fruitList, sc);

                    } else if (choice4.equals("2")) {
                        searchingMeatsPriceRange(meatList, sc);

                    }
                }
                case "5" -> {
                    System.out.println("Sökning genom EAN");
                    products();
                    String choice5 = sc.nextLine();
                    if (choice5.equals("1")) {
                        searchingEAN_Fruits(sc, fruitList);

                    } else if (choice5.equals("2")) {
                        searchingEAN_Meats(sc, meatList);

                    }
                }
                case "6" -> {
                    System.out.println("Ta bort");
                    products();
                    String choice6 = sc.nextLine();
                    if (choice6.equals("1")) {
                        removeFruits(fruitList, sc);

                    } else if (choice6.equals("2")) {
                        removeMeats(meatList, sc);
                    }
                }
                case "7" -> {
                    System.out.println("Lagersaldo");
                    products();
                    String choice7 = sc.nextLine();
                    if (choice7.equals("1")) {

                        lagerSaldoFruits(fruitList);
                        getLengthOfObjectsText_Dynamisk_Fruit(fruitList);

                    } else if (choice7.equals("2")) {

                        lagerSaldoMeats(meatList);
                        getLengthOfObjectsText_Dynamisk_Meat(meatList);
                    }
                }
                case "8" -> {
                    productsAddingToReceipt();
                    String choice7 = sc.nextLine();
                    if (choice7.equals("1")) {
                        //addToReceiptFruit();

                    } else if (choice7.equals("2")) {

                    }
                }
            }
        }
    }

    private static void addToReceiptFruit(ArrayList<Fruit> fruitArrayList, Scanner sc) {


    }

    private static void mainMeny() {
        System.out.println("\nMain meny");
        System.out.println("========");
        System.out.println("1. Add");
        System.out.println("2. Sökning genom namn ");
        System.out.println("3. Sökning genom pris ");
        System.out.println("4. Sökning genom prisintervall");
        System.out.println("5. Sökning genom EAN ");
        System.out.println("6. Ta bort");
        System.out.println("7. Lagersaldo");
        System.out.println("8. Lägg på kvitto");
        System.out.println("e. avsluta\n");
    }

    private static void products() {
        System.out.println("Product");
        System.out.println("========");
        System.out.println("Välja Category:");
        System.out.println("1. Välja Frukt");
        System.out.println("2. Välja Kött ");
        System.out.println("e. avsluta");

    }

    private static void productsAddingToReceipt() {
        System.out.println("Lagersaldo");
        System.out.println("Product");
        System.out.println("========");
        System.out.println("Välja Category:");
        System.out.println("1. Välja Frukt");
        System.out.println("2. Välja Kött ");
        System.out.println("3. Vissa på kvitto");
        System.out.println("e. avsluta");
    }

    private static void addFruits(Scanner sc, ArrayList<Fruit> fruitList) {


        //System.out.print("Please enter name of fruit: ");
        String name = "BANANA";
        //String name = sc.nextLine().toUpperCase();

        //System.out.print("Please enter price of " + name + ": ");
        int price = 10;
        //int price = sc.nextInt();
        //System.out.print("Please enter EAN (code) for " + name + ": ");
        int EAN = 123;
        //int EAN = sc.nextInt();

        addFruitArrays(fruitList, name, price, EAN);

        getLengthOfObjectsText_Dynamisk_Fruit(fruitList);
    }

    private static void addFruitArrays(ArrayList<Fruit> fruitArrayList, String name, int price, int EAN) {
        fruitArrayList.add(new Fruit(name, price, EAN));
        lagerSaldoFruits(fruitArrayList);
    }

    private static void addMeats(Scanner sc, ArrayList<Meat> meatList) {

        //System.out.print("Please enter name of fruit:");
        String name = "KYCKLING";
        //String name = sc.nextLine();

        //System.out.print("Please enter price of " + name + ": ");
        int price = 10;
        //int price = sc.nextInt();
        //System.out.print("Please enter EAN (code) for " + name + ": ");
        int EAN = 123;
        //int EAN = sc.nextInt();

        addMeatLists(meatList, name, price, EAN);

        getLengthOfObjectsText_Dynamisk_Meat(meatList);
    }

    private static void addMeatLists(ArrayList<Meat> meatList, String name, int price, int EAN) {
        meatList.add(new Meat(name, price, EAN));
        lagerSaldoMeats(meatList);
    }

    public static void searchingFruitsNamn(Scanner sc, ArrayList<Fruit> fruitList) {
        int counting = 1;
        String search = sc.nextLine().toUpperCase();

        for(Fruit fruit : fruitList) {
            if (fruit.getName() != null && fruit.getName().contains(search)) {
                System.out.println("Produkt: " + counting++ + " -> " + fruit);

            } else {
                System.out.println("The product you are looking for do not exist");
            }
        }
    }
    public static void searchingMeatsNamn(Scanner sc, ArrayList<Meat> meatList) {
        int counting = 1;
        String search = sc.nextLine().toUpperCase();

        for(Meat meats : meatList) {
            if (meats.getName() != null && meats.getName().contains(search)) {
                System.out.println("Produkt: " + counting++ + " -> " + meats);

            } else {
                System.out.println("The product you are looking for do not exist");
            }
        }
    }

    public static void searchingFruitPrices(Scanner sc, ArrayList<Fruit> fruitList) {
        System.out.print("Write price for at search product: ");
        int counting = 1;

        try {
            int search = sc.nextInt();
            for(Fruit fruit : fruitList) {
                if (fruit.getPris() == search) {
                    System.out.println("Produkt: " + counting++ + " -> " + fruit);

                }else
                    System.out.println("The product you are looking  do not exist");
            }
        } catch (Exception e) {
            System.out.println("The price you are looking for do not exist");
        }
    }

    public static void searchingMeatPrices(Scanner sc, ArrayList<Meat> meatList) {
        System.out.print("Write price for at search product: ");
        int counting = 1;

        try {
            int search = sc.nextInt();


            for(Meat meats : meatList) {
                if (meats.getPris() == search) {
                    System.out.println("Produkt: " + counting++ + " -> " + meats);
                }else
                    System.out.println("The product you are looking  do not exist");
            }
        } catch (Exception e) {
            System.out.println("The price you are looking for do not exist");
        }
    }

    private static void searchingFruitsPriceRange(ArrayList<Fruit> fruitList, Scanner sc) {
        System.out.print("Skriv till vilken pris vill du att varor ska skriva ut: ");

        try {
            int search = sc.nextInt();

            getLengthOfObjectsText_Dynamisk_Fruit(fruitList);

            fruitList.stream()
                    .filter(x -> x.getPris() < search)

                    .forEach(System.out::println);
            getLengthOfObjectsText_Dynamisk_Fruit(fruitList);
        } catch (Exception e) {
            System.out.println("The price you are looking for do not exist");
        }
    }

    private static void searchingMeatsPriceRange(ArrayList<Meat> meatList, Scanner sc) {
        System.out.print("Skriv till vilken pris vill du att varor ska skriva ut : ");

        try {
            int search = sc.nextInt();

            getLengthOfObjectsText_Dynamisk_Meat(meatList);

            meatList.stream()
                    .filter(x -> x.getPris() < search)
                    .forEach(System.out::println);

            getLengthOfObjectsText_Dynamisk_Meat(meatList);
        } catch (Exception e) {

            System.out.println("The price you are looking for do not exist");
        }
    }

    public static void searchingEAN_Fruits(Scanner sc, ArrayList<Fruit> fruitList) {
        System.out.print("Write EAN number for at search product: ");
        int counting = 1;

        try {
            int search = sc.nextInt();


            for(Fruit fruit : fruitList) {
                if (fruit.getIdkod() == search) {
                    System.out.println("Produkt: " + counting++ + " -> " + fruit);
                }else
                    System.out.println("The product you are looking  do not exist");
            }
        } catch (Exception e) {
            System.out.println("The price you are looking for do not exist");
        }
    }

    public static void searchingEAN_Meats(Scanner sc, ArrayList<Meat> meatList) {
        System.out.print("Write EAN number for at search product: ");
        int counting = 1;

        try {
            int search = sc.nextInt();


            for(Meat meats: meatList) {
                if (meats.getIdkod() == search) {
                    System.out.println("Produkt: " + counting++ + " -> " + meats);
                }else
                    System.out.println("The product you are looking  do not exist");
            }
        } catch (Exception e) {
            System.out.println("The price you are looking for do not exist");
        }
    }

    private static void removeFruits(ArrayList<Fruit> fruitArrayList, Scanner sc) {
        lagerSaldoFruits(fruitArrayList);
        getLengthOfObjectsText_Dynamisk_Fruit(fruitArrayList);

        System.out.print("Skriv vad vill du ta bort: ");

        try {
            String removeObject = sc.nextLine().toUpperCase();

            Fruit removeFruits = fruitArrayList.stream()
                    .filter(i -> i.getName().equals(removeObject))
                    .reduce((first, second) -> second)
                    .get();

            fruitArrayList.remove(removeFruits);
        } catch (Exception e) {
            System.out.println("Den här produkt finns inte i kategori.");
        }

        lagerSaldoFruits(fruitArrayList);
        getLengthOfObjectsText_Dynamisk_Fruit(fruitArrayList);

    }

    private static void removeMeats(ArrayList<Meat> meatArrayList, Scanner sc) {
        lagerSaldoMeats(meatArrayList);
        getLengthOfObjectsText_Dynamisk_Meat(meatArrayList);

        System.out.print("Skriv vad vill du ta bort: ");

        try {
            String removeObject = sc.nextLine().toUpperCase();

            Meat removeFruits = meatArrayList.stream()
                    .filter(i -> i.getName().equals(removeObject))
                    .reduce((first, second) -> second)
                    .get();

            meatArrayList.remove(removeFruits);
        } catch (Exception e) {
            System.out.println("Den här produkt finns inte i kategori.");
        }

        lagerSaldoMeats(meatArrayList);
        getLengthOfObjectsText_Dynamisk_Meat(meatArrayList);
    }

    public static void lagerSaldoFruits(ArrayList<Fruit> fruitArrayList) {
        int counting = 1;

        getLengthOfObjectsText_Dynamisk_Fruit(fruitArrayList);

        for (Fruit fruit : fruitArrayList) {
            System.out.println("Produkt: " + counting++ + " -> " + fruit);

        }

    }


    public static void lagerSaldoMeats(ArrayList<Meat> meatArrayList) {
        int counting = 1;

        getLengthOfObjectsText_Dynamisk_Meat(meatArrayList);

        for (Meat meat : meatArrayList) {
            System.out.println("Produkt: " + counting + " -> " + meat);
            counting++;
        }
    }

    private static void getLengthOfObjectsText_Dynamisk_Fruit(ArrayList<Fruit> fruitArrayList) {
        int nameLength = fruitArrayList.stream()
                .sorted(Comparator.comparing(Fruit::getName))
                .mapToInt(i -> i.getName().length())
                .reduce((first, second) -> second)
                .getAsInt();

        String prisLenght = String.valueOf(fruitArrayList.stream()
                .sorted(Comparator.comparing(Fruit::getPris))
                .map(i -> String.valueOf(i.getPris()))
                .reduce((first, second) -> second)
                .stream().mapToInt(i -> i.length()).sum());

        String eanLenght = String.valueOf(fruitArrayList.stream()
                .sorted(Comparator.comparing(Fruit::getIdkod))
                .map(i -> String.valueOf(i.getIdkod()))
                .reduce((first, second) -> second)
                .stream().mapToInt(i -> i.length()).sum());

        var nameLengthOfObject = nameLength;
        int prisLengthOfObject = Integer.parseInt(prisLenght);
        int eanLengthObject = Integer.parseInt(eanLenght);
        var sumOfObjectLenth = nameLengthOfObject + prisLengthOfObject + eanLengthObject;

        int lengthWithOutObjectLength = 37;
        xPlacer("=".repeat(sumOfObjectLenth + lengthWithOutObjectLength));
    }

    private static void getLengthOfObjectsText_Dynamisk_Meat(ArrayList<Meat> meatArrayList) {
        int nameLength = meatArrayList.stream()
                .sorted(Comparator.comparing(Meat::getName))
                .mapToInt(i -> i.getName().length())
                .reduce((first, second) -> second)
                .getAsInt();

        String prisLenght = String.valueOf(meatArrayList.stream()
                .sorted(Comparator.comparing(Meat::getPris))
                .map(i -> String.valueOf(i.getPris()))
                .reduce((first, second) -> second)
                .stream().mapToInt(i -> i.length()).sum());

        String eanLenght = String.valueOf(meatArrayList.stream()
                .sorted(Comparator.comparing(Meat::getIdkod))
                .map(i -> String.valueOf(i.getIdkod()))
                .reduce((first, second) -> second)
                .stream().mapToInt(i -> i.length()).sum());

        var nameLengthOfObject = nameLength;
        int prisLengthOfObject = Integer.parseInt(prisLenght);
        int eanLengthObject = Integer.parseInt(eanLenght);
        var sumOfObjectLenth = nameLengthOfObject + prisLengthOfObject + eanLengthObject;

        int lengthWithOutObjectLength = 37;
        xPlacer("=".repeat(sumOfObjectLenth + lengthWithOutObjectLength));
    }

    private static void xPlacer(String repeat) {
        System.out.println(repeat);
    }
}



