package Lab1;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input month
        String inputMonth;
        do {
            System.out.print("Nhap thang: ");
            inputMonth = scanner.nextLine().toLowerCase();
        } while (!isValidMonth(inputMonth));

        //Input year
        int inputYear;
        do {
            System.out.print("Nhap nam: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Nam khong hop le. Vui long nhap lai");
                scanner.next();
            }
            inputYear = scanner.nextInt();
        } while (inputYear < 0);

        scanner.close();

        int daysInMonth = getDaysInMonth(inputMonth, inputYear);


        System.out.println("So ngay trong thang " + inputMonth + " " + inputYear + ": " + daysInMonth + " ngay");
    }


    //Function to check the valid month
    private static boolean isValidMonth(String month) {
        String[] validMonths = {"january", "jan.", "jan", "1", "february", "feb.", "feb", "2", "march", "mar.", "mar", "3",
                "april", "apr.", "apr", "4", "may", "5", "june", "jun", "6", "july", "jul", "7", "august", "aug.", "aug",
                "8", "september", "sep.", "sep", "9", "october", "oct.", "oct", "10", "november", "nov.", "nov", "11",
                "december", "dec.", "dec", "12"};

        for (String validMonth : validMonths) {
            if (month.equals(validMonth)) {
                return true;
            }
        }

        System.out.println("Thang khong hop le. Vui long nhap lai.");
        return false;
    }

    //Function to get the day
    private static int getDaysInMonth(String month, int year) {
        switch (month) {
            case "january", "jan.", "jan", "1", "march", "mar.", "mar", "3",
                    "may", "5", "july", "jul", "7", "august", "aug.", "aug",
                    "8", "october", "oct.", "oct", "10", "december", "dec.", "dec", "12":
                return 31;
            case "april", "apr.", "apr", "4", "june", "jun", "6", "september",
                    "sep.", "sep", "9", "november", "nov.", "nov", "11":
                return 30;
            case "february", "feb.", "feb", "2":
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }

    // Check leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

