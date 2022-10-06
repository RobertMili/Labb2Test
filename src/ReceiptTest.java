import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Fruit> getReceiptFruit = getRecepitFruit();
        ArrayList<Meat>  getReceiptMeat =  getReceiptMeat();

        getReceiptFruit.forEach(System.out::println);

        //Fruit fruitObject = getFruitObject(sc, getReceiptFruit);
       // Meat meatObject = getMeatObject(sc, getReceiptMeat);


        BigDecimal count = BigDecimal.valueOf(getReceiptFruit.stream()
                .mapToInt(i -> i.getPris()).sum()
                );





        System.out.println("this is a sum " + count);
        Discounter easterDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.1)).add(count);

        BigDecimal sum = easterDiscounter.applyDiscount(count);
        System.out.println(sum);

        Discounter easterDiscounter2 = amount -> amount.multiply(BigDecimal.valueOf(0.1));
        BigDecimal test =  count.subtract(easterDiscounter2.applyDiscount(count));
        System.out.println(test);


//        ArrayList<Product> togeder = new ArrayList<>();
//        togeder.add(getFruitObject(sc,getReceiptFruit));
//        togeder.add(getMeatObject(sc,getReceiptMeat));
//
//
//
//        System.out.println("This is together");
//        togeder.forEach(System.out::println);
//
////        System.out.println(" ");
////        getReceiptFruit.remove(fruitObject);
////        getReceiptMeat.remove(meatObject);
//
//        System.out.println("This is a fruit list");
//        getReceiptFruit.forEach(System.out::println);
//        System.out.println("\nthis is a meat list:");
//        getReceiptMeat.forEach(System.out::println);


    }

    private static void test(Scanner sc, ArrayList<Fruit> getReceiptFruit, ArrayList<Product> togeder) {
        togeder.add(getFruitObject(sc, getReceiptFruit));
        togeder.add(getMeatObject(sc,getReceiptMeat()));
    }

    private static Meat getMeatObject(Scanner sc, ArrayList<Meat> getReceiptMeat) {
        System.out.println("Write which fruit will du have on receipt");
        String searching2 = sc.nextLine();
        Meat meatObject = getReceiptMeat.stream()
                .filter(i -> i.getName().equals(searching2))
                .reduce((first, second) -> second)
                .get();
        return meatObject;
    }

    private static Fruit getFruitObject(Scanner sc, ArrayList<Fruit> getReceiptFruit) {
        System.out.println("Write which fruit will du have on receipt");
        String searching = sc.nextLine();
        Fruit fruitObject = getReceiptFruit.stream()
                .filter(i -> i.getName().equals(searching))
                .reduce((first, second) -> second)
                .get();
        return fruitObject;
    }

    private static ArrayList<Meat> getReceiptMeat() {

        ArrayList<Meat> test2= new ArrayList<>();
        test2.add(new Meat("meat", 12,123));
        test2.add(new Meat("meat", 12,123));
        test2.add(new Meat("meat", 12,123));
        test2.add(new Meat("meat", 12,1));

        return test2;
    }

    public static ArrayList<Fruit> getRecepitFruit(){

        ArrayList<Fruit> test = new ArrayList<>();
        test.add(new Fruit("test", 100,123));
        test.add(new Fruit("test", 100,123));
        test.add(new Fruit("test", 100,123));
        test.add(new Fruit("test", 100,1));
        test.add(new Fruit("test", 100,1));

        return test;
    }

}
//    private static void removeFruits(ArrayList<Fruit> fruitArrayList, Scanner sc) {
//        lagerSaldoFruits(fruitArrayList);
//        getLengthOfObjectsText_Dynamisk_Fruit(fruitArrayList);
//
//        System.out.print("Skriv vad vill du ta bort: ");
//
//        try {
//            String removeObject = sc.nextLine().toUpperCase();
//
//            Fruit removeFruits = fruitArrayList.stream()
//                    .filter(i -> i.getName().equals(removeObject))
//                    .reduce((first, second) -> second)
//                    .get();
//
//            fruitArrayList.remove(removeFruits);
//        } catch (Exception e) {
//            System.out.println("Den här produkt finns inte i kategori.");
//        }
//
//        lagerSaldoFruits(fruitArrayList);
//        getLengthOfObjectsText_Dynamisk_Fruit(fruitArrayList);

   // }
