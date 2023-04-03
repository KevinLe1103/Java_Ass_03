package fa.training.entities;

import java.util.Arrays;
import java.util.List;

public class Department extends Employee {
    private String departmentName;
    private List<Employee> listOfEmployee;

    public Department(String departmentName, List<Employee> listOfEmployee) {
        this.departmentName = departmentName;
        this.listOfEmployee = listOfEmployee;
    }

    public Department(String ssn, String firstName, String lastName, String birthDate, String phone, String email, String departmentName, List<Employee> listOfEmployee) {
        super(ssn, firstName, lastName, birthDate, phone, email);
        this.departmentName = departmentName;
        this.listOfEmployee = listOfEmployee;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(List<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", listOfEmployee=" + listOfEmployee +
                '}';
    }
}
