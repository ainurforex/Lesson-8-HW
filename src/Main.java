import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
    }


    public static void homeWork1() {
        int year=2020;
        checkLeapYear(year);
    }
    public static void homeWork2() {
        int clientDeviceYear=2022;
        int clientOS=0;
        choiceOS(clientDeviceYear,clientOS);
    }

    public static void homeWork3() {
        int days=95;
        System.out.println("Потребуется дней: " + deliveryDays(days));
    }


    private static void checkLeapYear(int year) {
        String massage;
        if (year%4==0&&year%100!=0||year%400==0){
            massage=year+" год является високосным";
            } else {
            massage=year+" год не является високосным";
        }
        System.out.println(massage);
    }

    public static  void choiceOS(int clientDeviceYear, int clientOS){
        int currentYear = LocalDate.now().getYear();
        String massage;
        if (clientOS==0 ){
            if (clientDeviceYear<currentYear) {
                massage="Установите облегченную версию приложения для iOS по ссылке";
            }else massage="Установите версию приложения для iOS по ссылке";
        }else {
            if (clientDeviceYear<currentYear) {
                massage="Установите облегченную версию приложения для Android по ссылке";
            } else massage="Установите версию приложения для Android по ссылке";
        }
        System.out.println(massage);
    }

    public static  int deliveryDays(int deliveryDistance){
        int deliveryDays=1;
        if (deliveryDistance>20){
            deliveryDays++;
        }
        if (deliveryDistance>60){
            deliveryDays++;
        }
        return deliveryDays;
    }

}

