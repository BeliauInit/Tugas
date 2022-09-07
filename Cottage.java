package Cottage_Bhakti_Alam;

import java.util.Scanner;

public class Cottage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Proses pemilihan cottage
        System.out.println("""
                \033[4;33mCottage  \033[0m<(￣︶￣)>\033[4;33m  > Room\033[0m \s
                 >-----------------------<\s
                1>  Duku         \u001B[34m > 2 Room \u001B[0m\s
                2>  Jeruk        \u001B[34m > 2 Room \u001B[0m\s
                3>  Alpukat      \u001B[34m > 1 Room \u001B[0m\s
                4>  Jambu Air    \u001B[34m > 1 Room \u001B[0m\s
                5>  Durian       \u001B[34m > 2 Room \u001B[0m\s
                6>  Melon        \u001B[34m > 2 Room \u001B[0m\s
                7>  Belimbing    \u001B[34m > 2 Room \u001B[0m\s
                8>  Mangga       \u001B[34m > 2 Room \u001B[0m\s
                9>  Kedondong    \u001B[34m > 2 Room \u001B[0m\s
                10> Barrack      \u001B[34m > Per Person \u001B[0m""");

        System.out.print(" >-----------------------< \nChoose number Cottage = ");
        int code = input.nextInt();
        int Paying ;
        int people = 0;
        if (code == 10) {
            System.out.print(" >-----------------------< \nHow many people ? = ");
            people = input.nextInt();
        } else if (code <=0 || code >= 10)  {
            System.out.println("\n\u001B[31mOhh no Sorry (>_<'). \n\nWe cannot continue because there is no cottage");
            System.exit(0);
        }
        // Pemilihan Hari
        System.out.print(" >-----------------------< \nWeekend/Weekday/Holiday = ");
        String Days = input.next().toLowerCase();

        Paying = switch (code) {
            case 1, 2 ->
                    Days.equals("weekend") ? 915000 : Days.equals("weekday") ? 1025000 : Days.equals("holiday") ? 1225000 : 0;
            case 3, 4 ->
                    Days.equals("weekend") ? 575000 : Days.equals("weekday") ? 695000 : Days.equals("holiday") ? 895000 : 0;
            case 5, 6 ->
                    Days.equals("weekend") ? 595000 : Days.equals("weekday") ? 715000 : Days.equals("holiday") ? 915000 : 0;
            case 7, 8, 9 ->
                    Days.equals("weekend") ? 495000 : Days.equals("weekday") ? 575000 : Days.equals("holiday") ? 755000 : 0;
            case 10 ->
                    Days.equals("weekend") ? 25000 : Days.equals("weekday") ? 25000 : Days.equals("holiday") ? 35000 : 0;
            default -> 0;
        };
        //proses total
        if (Paying == 0) {
            System.out.println(" >-----------------------<\n\u001B[31mSorry we cannot accept that (>o<'). \n\nplease check your Days first !");
        } else System.out.printf(" >-----------------------< \nTotal must pay = Rp.%s", code == 10 ? Paying * people : Paying);

    }
}
