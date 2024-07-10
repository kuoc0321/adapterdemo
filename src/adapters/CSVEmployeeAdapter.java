package adapters;

import models.CSVEmployee;
import models.Employee;

public class CSVEmployeeAdapter implements Employee {
    private CSVEmployee csvEmployee;
    public CSVEmployeeAdapter(CSVEmployee csvEmployee) {
        this.csvEmployee = csvEmployee;
    }

    @Override
    public Integer getId() {
        return csvEmployee.getId();
    }

    @Override
    public String getFirstName() {
        return csvEmployee.getfName();
    }

    @Override
    public String getLastName() {
        return csvEmployee.getlName();
    }

    @Override
    public String getEmail() {
        return csvEmployee.getEmail();
    }

    @Override
    public String toString() {
        return "CSVEmployeeAdapter{" +
                "csvEmployee=" + csvEmployee +
                '}';
    }
}
