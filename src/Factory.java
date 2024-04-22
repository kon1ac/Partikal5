import java.util.Scanner;

class SoftToyFactory {

    // Функция для расчета общей производственной мощности
    public static int calculateTotalProductionCapacity(int[] machineCapacities) {
        int totalCapacity = 0;
        for (int capacity : machineCapacities) {
            totalCapacity += capacity;
        }
        return totalCapacity;
    }

    // Функция для определения средней производительности на одного работника
    public static double calculateAverageWorkerProductivity(int totalProduction, int totalWorkers) {
        if (totalWorkers == 0) {
            return 0;
        }
        return (double) totalProduction / totalWorkers;
    }

    // Функция для определения наличия неисправных машин на заводе
    public static boolean hasBrokenMachines(boolean[] machineStatus) {
        for (boolean status : machineStatus) {
            if (!status) {
                return true; // Если есть хотя бы одна неисправная машина, возвращаем true
            }
        }
        return false; // Если все машины работают исправно, возвращаем false
    }

    // Функция для производства мягких игрушек
    public static void produceSoftToys(String toyType, int quantity) {
        System.out.println("Производим " + quantity + " " + toyType + "\n... Готово!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] machineCapacities = {100, 150, 200, 80};
        int totalCapacity = calculateTotalProductionCapacity(machineCapacities);
        System.out.println("Общая производственная мощность: " + totalCapacity);

        int totalWorkers = 50;
        double averageProductivity = calculateAverageWorkerProductivity(totalCapacity, totalWorkers);
        System.out.println("Средняя производительность на одного работника: " + averageProductivity);

        boolean[] machineStatus = {true, true, false, true};
        boolean hasBroken = hasBrokenMachines(machineStatus);
        System.out.println("Есть ли неисправные машины на заводе? " + (hasBroken ? "Да" : "Нет"));

        System.out.println("Выберите тип мягкой игрушки (медведь, дракончик, жираф): ");
        String toyType = scanner.nextLine();

        System.out.println("Введите количество производимых игрушек: ");
        int quantity = scanner.nextInt();

        produceSoftToys(toyType, quantity);

        scanner.close();
    }
}