package com.nit.payroll.jdbc;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws Exception {

        EmployeeService emp = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1.Insert Employee Details in DB");
            System.out.println("2.Find Employee by Email ID");
            System.out.println("3.Increment Salary ");
            System.out.println("4.Highest Paid Salary");
            System.out.println("5.Fetch All Employee Data");
            System.out.println("6.Find Employee whose salary greater than given amount");
            System.out.println("7.Sort Employee based on salary in DESC");
            System.out.println("8.Find Average Salary");
            System.out.println("9.Find Highest Salary");
            System.out.println("10.Find Lowest Salary");
            System.out.println("11.Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1: {
                    System.out.print("Enter employee ID: ");
                    int empId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter Employee Name: ");
                    String empName = scanner.nextLine();

                    System.out.print("Enter Employee Email: ");
                    String emailId = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());

                    System.out.print("Enter the Department: ");
                    String department = scanner.nextLine();

                    if (salary > 0 && !empName.isEmpty()) {
                        Employee e1 = new Employee(empId, empName, emailId, salary, department);
                        emp.insertEmployee(e1);
                    } else {
                        System.out.println("Salary must be positive and name should not be empty");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter Email ID: ");
                    String emailId = scanner.nextLine();
                    emp.findByEmail(emailId);
                    break;
                }

                case 3: {
                    System.out.print("Enter employee ID: ");
                    int empId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter increment Amount: ");
                    double amount = Double.parseDouble(scanner.nextLine());

                    emp.incrementSalary(empId, amount);
                    break;
                }

                case 4: {
                    emp.findHighestSalaryEmployee();
                    break;
                }

                case 5: {
                    emp.fetchEmployeeData();
                    break;
                }

                case 6: {
                    System.out.print("Enter Amount: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    emp.findEmployeeSalaryGreaterThanValue(amount);
                    break;
                }

                case 7: {
                    emp.sortEmployeeSalaryOnDecending();
                    break;
                }

                case 8: {
                    emp.findAverageSalary();
                    break;
                }

                case 9: {
                    emp.highestSalary();
                    break;
                }

                case 10: {
                    emp.lowestSalary();
                    break;
                }

                case 11: {
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                }

                default:
                    System.out.println("Invalid Choice. Try Again.");
            }
        }
    }
}