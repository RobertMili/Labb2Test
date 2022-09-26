import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO change in addProduct to unComment



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
                        product();
                        String choice2 = sc.nextLine();

                    if (choice2.equals("1")){
                        addFruit(sc, fruitList);

                    }else if (choice2.equals("2")) {
                        addMeat(sc, meatList);
                    }
            } else if (choice.equals("2")){
                        System.out.println("sökning genom namn");
                        product();
                        String choice3 = sc.nextLine();

                    if (choice3.equals("1")){
                        System.out.println("Sökning fruit");
                        searchingFruit(sc,fruitList);

                    } else if(choice3.equals("2")){
                        System.out.println("Sökning kött");
                        searchingMeat(sc,meatList);

                    }
            } else if (choice.equals("3")){
                    System.out.println("Söknning genom pris");
                    product();
                    String choice4 = sc.nextLine();

                    if(choice4.equals("1")){
                        searchingFruitPrice(sc,fruitList);

                    }else if(choice4.equals("2")){
                        searchingMeatPrice(sc,meatList);

                    }
            }else if (choice.equals("4")){
                    System.out.println("Sökning genom EAN");
                    product();
                    String choice5 = sc.nextLine();

                    if(choice5.equals("1")){
                        searchingEAN_Fruit(sc,fruitList);

                    }else if(choice5.equals("2")){
                        searchingEAN_Meat(sc,meatList);

                    }
            }else if (choice.equals("5")){
                System.out.println("Ta bort");
            }
        }
    }


    public static void searchingTest(Scanner sc, ArrayList<Fruit> arrayList){ //Fråga Martin för den här
        String searching = sc.nextLine().toUpperCase();


            List<Fruit> fruits = arrayList.stream()
                    .filter(person -> person.getName().equals(searching))
                    .toList();
            fruits.forEach(System.out::println);


    }
    private static void mainMeny () {
            System.out.println("Main meny");
            System.out.println("========");
            System.out.println("1. Add");
            System.out.println("2. Sökning genom namn ");
            System.out.println("3. Sökning genom pris ");
            System.out.println("4. Sökning genom EAN ");
            System.out.println("5. Tabort");
            System.out.println("e. avsluta");
        }
    private static void product() {
            System.out.println("Product");
            System.out.println("========");
            System.out.println("Välja Category:");
            System.out.println("1. Välja Frukt");
            System.out.println("2. Välja Kött ");
            System.out.println("e. avsluta");

        }

    private static void addFruit(Scanner sc, ArrayList<Fruit> fruitList) {

            System.out.print("Please enter name of fruit: ");
                    String name = "BANANA";
            //String name = sc.nextLine().toUpperCase();

            System.out.print("Please enter price of " + name + ": ");
                    int price = 10;
            //int price = sc.nextInt();
            System.out.print("Please enter EAN (code) for " + name + ": ");
                     int EAN = 123;
            //int EAN = sc.nextInt();

            addFruitArray(fruitList, name, price, EAN);
        }
    private static void addFruitArray(ArrayList<Fruit> arrayList, String name, int price, int EAN) {
        arrayList.add(new Fruit(name,price,EAN));
        System.out.println(arrayList);
    }
    private static void addMeat(Scanner sc, ArrayList<Meat> meatList) {
        //System.out.print("Please enter name of fruit:");
        String name = "KYCKLING";
        //String name = sc.nextLine();

        //System.out.print("Please enter price of " + name + ": ");
        int price = 10;
        //int price = sc.nextInt();
        //System.out.print("Please enter EAN (code) for " + name + ": ");
        int EAN = 123;
        //int EAN = sc.nextInt();

       addMeatList(meatList, name, price, EAN);
    }
    private static void addMeatList(ArrayList<Meat> meatList, String name, int price, int EAN) {
        meatList.add(new Meat(name,price,EAN));
        System.out.println(meatList);
    }
    public static void searchingFruit(Scanner sc,ArrayList<Fruit> fruitList){

        String search = sc.nextLine().toUpperCase();
        for(Fruit fruit : fruitList) {
            if (fruit.getName() != null && fruit.getName().contains(search)) {
                System.out.println(fruit.getName() + " prise: " +  fruit.getPris() + " EAN : " + fruit.getIdkod());
            }
        }
        System.out.println("The product you are looking for do not exist");
    }
    public static void searchingMeat(Scanner sc,ArrayList<Meat> meatList){

        String search = sc.nextLine().toUpperCase();
        for(Meat meat : meatList) {
            if (meat.getName() != null && meat.getName().contains(search)) {
                System.out.println(meat.getName() + " prise: " +  meat.getPris() + " EAN : " + meat.getIdkod());
            }
        }
        System.out.println("The product you are looking for do not exist");
    }
    public static void searchingFruitPrice(Scanner sc, ArrayList<Fruit> fruitList){
        System.out.print("Write price for at search product: ");
        int search = sc.nextInt();


        for(Fruit fruit : fruitList) {
            if (fruit.getPris() == search) {
                System.out.println(fruit.getName() + " prise: " +  fruit.getPris() + " EAN : " + fruit.getIdkod());
            }else
            System.out.println("The product you are looking  do not exist");
        }
    }
    public static void searchingMeatPrice(Scanner sc, ArrayList<Meat> meatList){
        System.out.print("Write price for at search product: ");
        int search = sc.nextInt();


        for(Meat meat : meatList) {
            if (meat.getPris() == search) {
                System.out.println(meat.getName() + " prise: " +  meat.getPris() + " EAN : " + meat.getIdkod());
            }else
                System.out.println("The product you are looking  do not exist");
        }

    }
    private static void remove(ArrayList<Fruit> fruitArrayList) {
        System.out.println("Ta bort");
        fruitArrayList.remove(fruitArrayList.size() - 1);
        System.out.println(fruitArrayList);
    }
    public static void searchingEAN_Fruit(Scanner sc, ArrayList<Fruit> fruitList){
        System.out.print("Write EAN number for at search product: ");
        int search = sc.nextInt();


        for(Fruit fruit : fruitList) {
            if (fruit.getIdkod() == search) {
                System.out.println(fruit.getName() + " prise: " + fruit.getPris() + " EAN : " + fruit.getIdkod());
            }else
                System.out.println("The product you are looking  do not exist");
        }
    }
    public static void searchingEAN_Meat(Scanner sc, ArrayList<Meat> meatList){
        System.out.print("Write EAN number for at search product: ");
        int search = sc.nextInt();


        for(Meat meat : meatList) {
            if (meat.getIdkod() == search) {
                System.out.println(meat.getName() + " prise: " + meat.getPris() + " EAN : " + meat.getIdkod());
            }else
                System.out.println("The product you are looking  do not exist");
        }
    }



//        private static void add (Scanner scanner, ArrayList mejeriprodukterList) {
//            for (int i = 0; i <=2; i++) {
//                mejeriprodukterList.add(new Mejeriprodukter(scanner.nextLine()));
//            }
//            System.out.println("Den har ar lagerSaldo " + (mejeriprodukterList.size()));
//            System.out.println(mejeriprodukterList);
//        }

    }
