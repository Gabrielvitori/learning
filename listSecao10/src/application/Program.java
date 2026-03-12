package application;


import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many emmployees will be registered? ");
        int n = scanner.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1));
            System.out.println("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Salary: ");
            Double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(emp != null){
            System.out.println("Enter the percentage: ");
            double porcentage = scanner.nextDouble();
            emp.increaseSalary(porcentage);

        }else{
            System.out.println("This id not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : list) {
            System.out.println(obj);
        }


        scanner.close();

    }
}
