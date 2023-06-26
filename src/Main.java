public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printAllEmployees();
        System.out.println(" Сумма затрат сотрудников на месяц " + storage.calculateAllSalaries());
        System.out.println(" Самый бедный сотрудник " + storage.findPoorEmployee());
        System.out.println(" Самый богатый сотрудник " + storage.richPoorEmployee());
        System.out.println(" Средняя значения зарплат " + storage.calculateAverageSalary());
        storage.printFullName();


    }
}