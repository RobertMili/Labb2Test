import java.util.ArrayList;
import java.util.Scanner;

public class SearchingArrayList {
    public static void main(String[] args) {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        Scanner sc = new Scanner(System.in);
        //Instantiating an ArrayList object
       list.add(new Fruit("java", 2,123));


        System.out.println("Contents of the array list: ");
        String test = sc.nextLine();
        for (Fruit element : list) {
            if (element.equals(test)) {
                System.out.println(element);
            }else{
                System.out.println("didnt found");
            }
        }
    }
}

