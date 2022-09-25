import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TODO change in addProduct to unComment



        ArrayList<Fruit> fruitArray = new ArrayList<>();


        boolean switching = true;
        while (switching) {
            mainMeny();
            String choice = sc.nextLine();

            if (choice.equals("e") || choice.equals("E")) {
                System.out.println("exit");
                switching = false;
            }else if (choice.equals("1")){
                mejeriprodukter();

                String choice2 = sc.nextLine();
                if (choice2.equals("1")){
                    addProduct(sc, fruitArray);

                }else if (choice2.equals("2")){

                    System.out.println("Sökning ");
                    String search = sc.nextLine();
                    for(Fruit fruit : fruitArray) {
                        if (fruit.getName() != null && fruit.getName().contains(search)) {
                            System.out.println(fruit.getName() + " prise: " +  fruit.getPris() + " EAN : " + fruit.getIdkod());
                        }
                    }
                    System.out.println("didnt found");

                }else if (choice2.equals("3")){
                        remove(fruitArray);
                }
            }
        }
    }


    private static void remove(ArrayList<Fruit> fruitArrayList) {
        System.out.println("Ta bort");
        fruitArrayList.remove(fruitArrayList.size() - 1);
        System.out.println(fruitArrayList);
    }

    private static void mainMeny () {
            System.out.println("Product");
            System.out.println("========");
            System.out.println("Välja Category:");
            System.out.println("1. Välja Frukt");
            System.out.println("2. Frys varor ");
            System.out.println("3. Ny vara");
            System.out.println("e. avsluta");
        }
        private static void mejeriprodukter () {
            System.out.println("Frukt");
            System.out.println("========");
            System.out.println("1. Add");
            System.out.println("2. Sökning ");
            System.out.println("3. Tabort");
            System.out.println("e. avsluta");

        }

        private static void addProduct(Scanner sc, ArrayList<Fruit> arrayList) {
            //System.out.print("Please enter name of fruit:");
            String name = "BANANA";
            //String name = sc.nextLine();

            //System.out.print("Please enter price of fruit: ");
            int price = 10;
            //int price = sc.nextInt();
            //System.out.print("Please enter EAN (code)");
            int EAN = 123;
            //int EAN = sc.nextInt();

            addFruitArray(arrayList, name, price, EAN);
        }

    private static void addFruitArray(ArrayList<Fruit> arrayList, String name, int price, int EAN) {
        arrayList.add(new Fruit(name,price,EAN));
        System.out.println(arrayList);
    }



//        private static void add (Scanner scanner, ArrayList mejeriprodukterList) {
//            for (int i = 0; i <=2; i++) {
//                mejeriprodukterList.add(new Mejeriprodukter(scanner.nextLine()));
//            }
//            System.out.println("Den har ar lagerSaldo " + (mejeriprodukterList.size()));
//            System.out.println(mejeriprodukterList);
//        }

    }
