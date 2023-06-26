public class Storage {
    private EmpLoyee[] empLoyees = new EmpLoyee[10];

    public Storage() {
        empLoyees[0] = new EmpLoyee("Петров", "Иван", "Сергеивич", 1, 12500);
        empLoyees[1] = new EmpLoyee("Иванов", "Иван", "Иванович", 2, 9500);
        empLoyees[2] = new EmpLoyee("Бодров", "Сергей", "Сергеивич", 3, 55803);
        empLoyees[3] = new EmpLoyee("Сидоров", "Степан", "Александрович", 4, 107999);
        empLoyees[4] = new EmpLoyee("Смирнов", "Владислав", "Анатольевич", 5, 13499);
        empLoyees[5] = new EmpLoyee("Калашников ", "Михаил ", "Тимофеевич", 1, 425369);
        empLoyees[6] = new EmpLoyee("Чайковский", "Петр ", "Ильич ", 2, 63125);
        empLoyees[7] = new EmpLoyee("Толстой  ", "Лев  ", "Николаевич ", 3, 574698);
        empLoyees[8] = new EmpLoyee("Достоевский ", "Федор ", "Михайлович ", 4, 11230);
        empLoyees[9] = new EmpLoyee("Менделеев ", "Дмитрий ", "Иванович ", 5, 809621);
    }

    public void printAllEmployees() {
        for (EmpLoyee empLoyee : empLoyees) {
            System.out.println(empLoyee);
        }
    }

    public double calculateAllSalaries() {
        double salaries = 0;
        for (EmpLoyee empLoyee : empLoyees) {
            salaries += empLoyee.getSalary();
        }
        return salaries;
    }

    public EmpLoyee findPoorEmployee() {
        EmpLoyee pooreEmployee = empLoyees[0];
        for (EmpLoyee employee : empLoyees) {
            if (employee.getSalary() < pooreEmployee.getSalary()) {
                pooreEmployee = employee;
            }
        }
        return pooreEmployee;
    }

    public EmpLoyee richPoorEmployee() {
        EmpLoyee richEmployee = empLoyees[0];
        for (EmpLoyee employee : empLoyees) {
            if (employee.getSalary() > richEmployee.getSalary()) {
                richEmployee = employee;
            }
        }
        return richEmployee;
    }

    public double calculateAverageSalary() {
        double allSalary = calculateAllSalaries();


        return allSalary / empLoyees.length;
    }

    public void printFullName() {
        for (EmpLoyee empLoyee : empLoyees) {
            System.out.println(empLoyee.getFullName());
        }
    }


}
