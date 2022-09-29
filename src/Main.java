import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO change in addProduct to unComment
        // ta bort kolla upp

        ArrayList<Fruit> fruitList = new ArrayList<>();
        ArrayList<Meat>  meatList = new ArrayList<>();

        boolean switching = true;
        while (switching) {
            mainMeny();
            String choice = sc.nextLine();

            if (choice.equals("e") || choice.equals("E")) {
                System.out.println("exit");
                switching = false;
                }

            else if (choice.equals("1")){
                        products();
                        String choice2 = sc.nextLine();

                    if (choice2.equals("1")){
                        addFruits(sc, fruitList);

                    }else if (choice2.equals("2")) {
                        addMeats(sc, meatList);
                    }
            } else if (choice.equals("2")){
                        System.out.println("sökning genom namn");
                        products();
                        String choice3 = sc.nextLine();

                    if (choice3.equals("1")){
                        System.out.println("Sökning fruit");
                        searchingFruits(sc,fruitList);

                    } else if(choice3.equals("2")){
                        System.out.println("Sökning kött");
                        searchingMeats(sc,meatList);

                    }
            } else if (choice.equals("3")){
                    System.out.println("Söknning genom pris");
                    products();
                    String choice4 = sc.nextLine();

                    if(choice4.equals("1")){
                        searchingFruitPrices(sc,fruitList);

                    }else if(choice4.equals("2")){
                        searchingMeatPrices(sc,meatList);

                    }
            }else if (choice.equals("4")){
                    System.out.println("Sökning genom EAN");
                    products();
                    String choice5 = sc.nextLine();

                    if(choice5.equals("1")){
                        searchingEAN_Fruits(sc,fruitList);

                    }else if(choice5.equals("2")){
                        searchingEAN_Meats(sc,meatList);

                    }
            }else if (choice.equals("5")){
                System.out.println("Ta bort");
                products();
                String choice6 = sc.nextLine();

                if(choice6.equals("1")){
                    removeFruits(fruitList);

                }else if(choice6.equals("2")){
                    removeMeats(meatList);
                }
            }else if (choice.equals("6")){
                System.out.println("Lagersaldo");
                products();
                String choice7 = sc.nextLine();

                if(choice7.equals("1")){
                    lagerSaldoFruits(fruitList);

                }else if (choice7.equals("2")){
                    lagerSaldoMeats(meatList);
                }
            }
        }
    }
    private static void mainMeny () {
            System.out.println("\nMain meny");
            System.out.println("========");
            System.out.println("1. Add");
            System.out.println("2. Sökning genom namn ");
            System.out.println("3. Sökning genom pris ");
            System.out.println("4. Sökning genom EAN ");
            System.out.println("5. Tabort");
            System.out.println("6. Lagersaldo");
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
        }
    private static void addFruitArrays(ArrayList<Fruit> fruitArrayList, String name, int price, int EAN) {
        fruitArrayList.add(new Fruit(name,price,EAN));
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
    }
    private static void addMeatLists(ArrayList<Meat> meatList, String name, int price, int EAN) {
        meatList.add(new Meat(name,price,EAN));
        lagerSaldoMeats(meatList);
    }
    public static void searchingFruits(Scanner sc,ArrayList<Fruit> fruitList){
            String search = sc.nextLine().toUpperCase();

            fruitList.forEach(i ->{
                if (!i.getName().equals(search)){
                    System.out.println("The "+ search + " you are looking for do not exist");
                }else{
                    fruitList.forEach(System.out::println);
                }
            });
    }
    public static void searchingMeats(Scanner sc,ArrayList<Meat> meatList){
        String search = sc.nextLine().toUpperCase();

        meatList.forEach(i ->{
            if (!i.getName().equals(search)){
                System.out.println("The "+ search + " you are looking for do not exist");
            }else{
                meatList.forEach(System.out::println);
            }
        });
    }
    public static void searchingFruitPrices(Scanner sc, ArrayList<Fruit> fruitList){
        System.out.print("Write price for at search product: ");
        int search = sc.nextInt();

        fruitList.forEach(i ->{
            if (i.getPris() != search){
                System.out.println("The "+ search + " price  you are looking for do not exist");
            }else{
                fruitList.forEach(System.out::println);
            }
        });
    }
    public static void searchingMeatPrices(Scanner sc, ArrayList<Meat> meatList){
        System.out.print("Write price for at search product: ");
        int search = sc.nextInt();

        meatList.forEach(i ->{
            if (i.getPris() != search){
                System.out.println("The "+ search + " price you are looking for do not exist");
            }else{
                meatList.forEach(System.out::println);
            }
        });

    }
    public static void searchingEAN_Fruits(Scanner sc, ArrayList<Fruit> fruitList){
        System.out.print("Write EAN number for at search product: ");
        int search = sc.nextInt();

        fruitList.forEach(i ->{
            if (i.getIdkod() != search){
                System.out.println("The "+ search + " EAN you are looking for do not exist");
            }else{
                fruitList.forEach(System.out::println);
            }
        });
    }
    public static void searchingEAN_Meats(Scanner sc, ArrayList<Meat> meatList){
        System.out.print("Write EAN number for at search product: ");
        int search = sc.nextInt();

        meatList.forEach(i ->{
            if (i.getIdkod() != search){
                System.out.println("The "+ search + " EAN you are looking for do not exist");
            }else{
                meatList.forEach(System.out::println);
            }
        });
    }
    private static void removeFruits(ArrayList<Fruit> fruitArrayList) {
        System.out.println("Ta bort");

        if (fruitArrayList.isEmpty()){
            System.out.println("Den är tömt");
        }else{
            fruitArrayList.remove(fruitArrayList.size() - 1);
        }
      lagerSaldoFruits(fruitArrayList);
    }
    private static void removeMeats(ArrayList<Meat> meatArrayList) {
        System.out.println("Ta bort");

        if (meatArrayList.isEmpty()){
            System.out.println("Den är tömt");
        }else{
            meatArrayList.remove(meatArrayList.size() - 1);
        }
       lagerSaldoMeats(meatArrayList);
    }
    public static void lagerSaldoFruits(ArrayList<Fruit> fruitArrayList){
        int counting = 1;

        for (Fruit fruit : fruitArrayList) {
            System.out.println("Produkt: " + counting + " -> " + fruit);
            counting++;
        }
    }
    public static void lagerSaldoMeats(ArrayList<Meat> meatArrayList){
        int counting = 1;

        for (Meat meat : meatArrayList) {
            System.out.println("Produkt: " + counting + " -> " + meat);
            counting++;
        }
    }
}
