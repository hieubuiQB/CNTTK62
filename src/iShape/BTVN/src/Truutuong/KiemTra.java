package Truutuong;

public class KiemTra {
    public static void main(String[] args) {
        Iemployee employee1 = new PartTimeEmployee("Hieu", 90000, 7);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        Iemployee employee2 = new FullTimeEmployee("Hoa", 85000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}