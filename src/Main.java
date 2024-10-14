public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 2034;
        year(a);

        System.out.println("Задание 2");
        int clientDeviceOs = 0;
        int clientDeviceYear = 2015;
        checkerDeviceClient(clientDeviceOs, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        checkDeliveryDistance(deliveryDistance);
    }

    public static void year(int yearToCheck) {
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
            System.out.println("Год " + yearToCheck + " високосный");
        } else {
            System.out.println("Год " + yearToCheck + " не високосный");
        }
    }

    public static void checkerDeviceClient(int deviceOs, int deviceYear) {
        if (deviceOs == 0) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (deviceOs == 1) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Выберите операционную систему вашего устройства");
        }
    }

    public static void checkDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставка не предусмотрена");
        }
    }
}
