import java.util.ArrayList;
import java.util.Objects;

public class Assessment {



    public static int square(int number){
        System.out.print("The square root of " + number + " is ");
        number *=number;

        return number;
    }

    public static int sum(int number1, int number2){
        System.out.print("The sum of " + number1 + " and  " + number2 + " is ");
        return number1 + number2;
    }

    public static double sum(double number1, double number2){
        System.out.print("The sum of " + number1 + " and  " + number2 + " is ");
        return number1 + number2;
    }

    public static double average(ArrayList<Integer> numbers){
        double total = 0;
        for(int i = 0; i < numbers.size(); i++) {
            total = numbers.get(i) + total;

        }
        double average = total/numbers.size();
        System.out.print("The average of " + numbers + " is ") ;
        return average;
    }

    public static ArrayList<String> capitalizeRecords(ArrayList<String> Users){
        for (String user: Users){


        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(square(4));
        System.out.println(sum(3,4));
        System.out.println(sum(3.1,4.2));

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(3);
        System.out.println(list);
        System.out.println(average(list));

        User Elvin = new User("elvin", "terrell",true);
        User Rosalie = new User("Rosalie", "Diaz", true);
        User Nick = new User("Nick", "Jonas", false);

        ArrayList<String> Administrators = new ArrayList<>();

        Administrators.add(Elvin.toString());
        Administrators.add(Rosalie.toString());

        System.out.println(Elvin.getLastName());


    }



}
