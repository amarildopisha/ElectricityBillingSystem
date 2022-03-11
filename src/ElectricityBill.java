import java.util.Date;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();

        System.out.println("Full name of the Consumer : ");
        String fullName = input.nextLine();

        System.out.println("The amount of kW used : ");
        double unit = input.nextDouble();

        double priceWithTVSH = 11.4; // Albanian Lek
        double sumkW = unit * priceWithTVSH;

        System.out.println("_______Electricity Bill_______ \n" +
                "Consumer Name : " + fullName + "\n" +
                "City : Tirana \n" +
                "Country: Albania \n" +
                "kw Spend: " + unit + "\n" +
                "Total amount to Pay : " + sumkW + " ALL" +"\n" +
                "Date of Payment : " + date +"\n" +
                "_______________________________");
        System.out.println();
        System.out.println("___________THANK YOU___________");






    }
}
