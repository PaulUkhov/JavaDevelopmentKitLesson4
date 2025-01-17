package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory(List<Employee> employees) {
        this.employees = employees;
    }

    // Метод для добавления сотрудника
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для поиска имен сотрудников по стажу
    public List<String> findNamesByExperience(List<Integer> experiences) {
        return employees.stream()
                .filter(emp -> experiences.contains(emp.getExperience())) // Фильтруем по стажу
                .map(Employee::getName) // Извлекаем только имя сотрудника
                .collect(Collectors.toList()); // Собираем имена в список
    }
    public List<String> findNamesByphoneNumber(List<Long> phoneNumber) {
        return employees.stream()
                .filter(emp -> phoneNumber.contains(emp.getPhoneNumber())) // Фильтруем по номеру телефона
                .map(Employee::getName) // Извлекаем только имя сотрудника
                .collect(Collectors.toList()); // Собираем имена в список
    }

    public List<String> InfoId(List<Integer> id){
        return employees.stream().filter(el -> id.contains(el.getId()))
                .map(Employee::getName)
                .collect(Collectors.toList());

    }
}



