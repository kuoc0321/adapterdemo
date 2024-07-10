import adapters.CSVEmployeeAdapter;
import adapters.LDAPEmployeeAdapter;
import models.CSVEmployee;
import models.DBEmployee;
import models.Employee;
import models.LDAPEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = getAllEmployees();
        System.out.println(employees);
    }

    private static List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();
        DBEmployee dbEmployee = new DBEmployee(
                1,
                "Fin",
                "Kr",
                "Fin.kr@gmail.com");
        allEmployees.add(dbEmployee);

        // Creating LDAP Employee
        LDAPEmployee ldapEmployee = new LDAPEmployee(
                2,
                "Leon",
                "Kr",
                "Leon.kr@gmail.com");

        allEmployees.add(new LDAPEmployeeAdapter(ldapEmployee));

        // Creating CSV employee
        CSVEmployee csvEmployee = new CSVEmployee(
                3,
                "Ali",
                "Kr",
                "Ali.kr@gmail.com"
        );

        allEmployees.add(new CSVEmployeeAdapter(csvEmployee));
        return allEmployees;
    }
}