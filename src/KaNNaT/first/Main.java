package KaNNaT.first;


public class Main {
// Task # 1
    public static void calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " the year is a leap year");
    } else {
        System.out.println(year + " the year is not a leap yea");
    }
    }

// Task # 2
    public static void getClientOS(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Install the iOS version of the app by following the link");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Install the Android version of the app by following the link");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Install the lite version of the iOS app by following the link");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Install the lite version of the Android app by following the link");
        }
    }

// Task # 3
    public static void deliveryCardDay(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Card delivery time: 1 day");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Card delivery time: 2 day");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Card delivery time: 3 day");
        } else if (deliveryDistance > 100) {
            System.out.println("Delivery is not carried out, we bring you our apologies");
    }}


    public static void main(String[] args) {
        // Task # 1
        calculateLeapYear(2020);
        calculateLeapYear(2022);
        calculateLeapYear(1548);


        // Task # 2
        getClientOS(0, 2014);
        getClientOS(0,2022);
        getClientOS(1,2020);
        getClientOS(1,2000);


        // Task # 3
        deliveryCardDay(18);
        deliveryCardDay(42);
        deliveryCardDay(87);
        deliveryCardDay(166);

        }
    }
