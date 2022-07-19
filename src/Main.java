public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2000;
        boolean clientDeviceYearSmall = clientDeviceYear < 2015;
        boolean clintDeviceYearBig = clientDeviceYear >= 2015;
        if (clientDeviceYearSmall && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYearSmall && clientOS != 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clintDeviceYearBig && clientOS == 0) ;
        if (clintDeviceYearBig && clientOS != 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 1981;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" Год високосный ");
        } else {
            System.out.println( " Год не високосный");
        }
    }
    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDay =1;
        if (deliveryDistance>20){
            deliveryDay++;
        }
        if (deliveryDistance>60){
            deliveryDay++;
        }
        System.out.println(" Потребуется дней " + deliveryDay);

    }
    public static void task5(){
       int monthNumber = 8;
       switch (monthNumber) {
           case 12:
           case 1:
           case 2:
               System.out.println( " Зима ");
              break;

           case 3:
           case 4:
           case 5:
           System.out.println("весна");
              break;
           case 6:
           case 7:
           case 8:
           System.out.println( " Лето ");
               break;
           case 9:
           case 10:
           case 11:

           System.out.println( " Осень");
               break;
           default:
               System.out.println( " такого месца не существует ");
       }
    }
}