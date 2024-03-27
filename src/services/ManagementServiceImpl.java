package services;

import globaldata.GlobalData;
import model.Employee;
import util.InputUtil;


import java.util.ArrayList;


public class ManagementServiceImpl implements ManagementService {
    @Override
    public void seeAllEmployee() {

        if (GlobalData.employees == null) {
            return;
        }
        for (int i = 0; i < GlobalData.employees.size(); i++) {
            Employee employee = GlobalData.employees.get(i);

            System.out.println((i + 1) + " - " + employee);

        }
    }

    @Override
    public void findEmployee() {
        System.out.println("=====| FIND EMPLOYEE |======");

        String text = InputUtil.InputRequiredStr("Search: ");
        System.out.println("======================");


        for (int i = 0; i < GlobalData.employees.size(); i++) {
            Employee emp = GlobalData.employees.get(i);
            if (emp.getName().contains(text) || emp.getSurname().contains(text)) { // id
                System.out.println(emp);

            }
        }
    }


    @Override
    public void addNewEmployee() {
        System.out.println("=====| ADD NEW EMPLOYEE |======");

        int howEmploye = InputUtil.InputRequiredInt("How to want Employee add?");

        System.out.println("Enter the information.");

        GlobalData.employees = new ArrayList<>(howEmploye);

        for (int i = 0; i < howEmploye; i++) {

            int id = Integer.parseInt(InputUtil.InputRequiredStr("ID: "));
            String name = InputUtil.InputRequiredStr("Name: ");
            String surname = InputUtil.InputRequiredStr("Surname :");
            String dateOfBrith = InputUtil.InputRequiredStr("Date of Birth: ");
            String position = InputUtil.InputRequiredStr("Position: ");
            double salary = InputUtil.InputRequiredDbl("Salary: ");

            Employee employee = new Employee(id, name, surname, dateOfBrith, position, salary);
            System.out.println("===============================");
            GlobalData.employees.add(employee);

        }
        System.out.println(GlobalData.employees);

        System.out.println("EMPLOYEE ADDED SUCCESSFULLY!");


    }


    @Override
    public void updateEmployee() {
        System.out.println("=====| UPDATE EMPLOYEE |======");

        seeAllEmployee();

        System.out.println("======================");

        int select = InputUtil.InputRequiredInt("Select Employee:");

        Employee selectedEmployee = GlobalData.employees.get(select-1);

        selectedEmployee.setId(InputUtil.InputRequiredInt("ID: "));
        selectedEmployee.setName(InputUtil.InputRequiredStr("Name: "));
        selectedEmployee.setSurname(InputUtil.InputRequiredStr("Surname :"));
        selectedEmployee.setDateOfBrith(InputUtil.InputRequiredStr("Date of Birth: "));
        selectedEmployee.setPosition(InputUtil.InputRequiredStr("Position: "));
        selectedEmployee.setSalary(InputUtil.InputRequiredDbl("Salary: "));

        System.out.println("===============================");
        System.out.println(selectedEmployee.toString());

        System.out.println("EMPLOYEE UPDATED SUCCESSFULLY!");


    }

    @Override
    public void deleteEmployee() {

        System.out.println("=====| DELETE EMPLOYEE |======");

        seeAllEmployee();

        System.out.println("======================");

        int select = InputUtil.InputRequiredInt("Select employee for delete:");

        Employee deleteEmp = GlobalData.employees.remove(select - 1);

        System.out.println("EMPLOYEE DELETED SUCCESSFULLY!");

        System.out.println("======================");

        seeAllEmployee();

    }
}
