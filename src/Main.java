public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Другие операционные системы не поддерживаются");
        }

    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        if (clientOS == 1){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        if (clientOS == 0){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }
    public static void task3 (){
        System.out.println("Задача 3");
        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }

    }
    public static void task4 (){
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days = -1;
        if (deliveryDistance <= 20){
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        }
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        }else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц является зимой");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц является весной");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц является летом");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц является осенью");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}