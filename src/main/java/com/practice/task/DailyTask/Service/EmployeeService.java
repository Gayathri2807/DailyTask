package com.practice.task.DailyTask.Service;

import com.practice.task.DailyTask.Model.Employee;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    /***
     * Setting the Employee Data
     * @return employeeList
     */
    public List<Employee> setEmployee() {

        Employee employee1 = new Employee(1,"Gayathri",30000);
        //employee1.setEid(1);
        //employee1.setEname("Gayathri");
        //employee1.setSalary(30000);
        employeeList.add(employee1);

        Employee employee2 = new Employee(2,"Priyanka",40000);
        employeeList.add(employee2);

        Employee employee3 = new Employee(3,"Radha",18000);
        employeeList.add(employee3);

        Employee employee4 = new Employee(4,"Krithika",70000);
        employeeList.add(employee4);

        Employee employee5 = new Employee(5,"Buvana",60000);
        employeeList.add(employee5);

        return employeeList;
    }

    /***
     * Getting the Employee Data using ID
     * @param id
     * @return employeeList
     */
    public Employee getEmployee(int id) {
        return employeeList.stream().filter(employee -> employee.getEid() == id).findFirst().get();
    }

    /***
     * Adding the new Employee Data
     * @param employee
     * @return employeeList
     */
    public List<Employee> addEmployee(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    /***
     * Updating the Employee
     * @param id, employee
     * @return employeeList
     */
    public void updateEmployee(int id, Employee employee) {
        int i = 0;
        for (Employee emp : employeeList) {
            if (emp.getEid() == id) {
                employeeList.set(i, employee);
                return;
            }
            i++;
        }
    }
    /***
     * Deleting the employee Data using ID
     * @param id
     * @return employeeList
     */
    public List<Employee> deleteEmployee(int id) {
        employeeList.removeIf(employee -> employee.getEid() == id);
        return employeeList;
    }
    /***
     * Getting the employee data with salary<=20000
     * @return belowSalary
     */
    public List<Employee> getbelowSalary () {
        List<Employee> belowSalary = employeeList.stream().filter(employee -> employee.getSalary() <= 20000).collect(Collectors.toList());
        return belowSalary;
    }
    /***
     * Getting the employee data with salary>=20000 && salary<=50000
     * @return betweenSalary
     */
    public List<Employee> getbetweenSalary () {
        List<Employee> betweenSalary = employeeList.stream().filter(employee -> employee.getSalary() >= 20000 && employee.getSalary() <= 50000).collect(Collectors.toList());
        return betweenSalary;
    }

    /***
     * Getting the employee data with salary>=50000
     * @return aboveSalary
     */
    public List<Employee> getaboveSalary () {
        List<Employee> aboveSalary = employeeList.stream().filter(employee -> employee.getSalary() >= 50000).collect(Collectors.toList());
        return aboveSalary;
    }
    /***
     * Factorial of a number
     */
    public int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    /***
     * Addition of n numbers
     */
    public int add(int n) {
        List<Integer> list =new ArrayList<>();

        for (int j = 0; j <= n; j++) {
            list.add(j);
        }
            int sum = 0;
            for (Integer i : list)
                sum += i;
            return sum;
        }

}




