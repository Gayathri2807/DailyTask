package com.practice.task.DailyTask.Controller;

import com.practice.task.DailyTask.Model.Employee;
import com.practice.task.DailyTask.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    List<Employee> employeeList;

    @GetMapping("/setemployees")
    public List<Employee> employees(){
        employeeList = employeeService.setEmployee();
        return employeeList;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public List<Employee> postEmployees(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public void putEmployees(@RequestBody Employee employee, @PathVariable int id){
         employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/belowSalary")
    public List<Employee> getbelowSalary() {
        List<Employee> employees = employeeService.getbelowSalary();
        return employees;
    }

    @GetMapping("/betweenSalary")
    public List<Employee> getbetweenSalary() {
        List<Employee> employees = employeeService.getbetweenSalary();
        return employees;
    }

    @GetMapping("/aboveSalary")
    public List<Employee> getaboveSalary() {
        List<Employee> employees = employeeService.getaboveSalary();
        return employees;
    }

    @GetMapping("/fact/{n}")
    public int getFact(@PathVariable int n){
        return employeeService.fact(n);
    }

    @GetMapping("/add/{n}")
    public int getSum(@PathVariable int n){
        return employeeService.add(n);
    }
}
