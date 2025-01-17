package org.example;
//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        EmployeeDirectory employeeDirectory = new EmployeeDirectory(employees);

        Employee employee = new Employee(1, 89092993043L, "Paul", 1);
        Employee employee2 = new Employee(2, 89092994545L, "Petr", 2);
        employees.add(employee);
        employees.add(employee2);
       List<Integer> ex = Arrays.asList(2);
       List<String> names =employeeDirectory.findNamesByExperience(ex);
        System.out.println(names);
        List<Long> num = Arrays.asList(89092993043L);
        List<String> names2 =employeeDirectory.findNamesByphoneNumber(num);
        System.out.println(names2);
        List<Integer> isd = Arrays.asList(2);
        List<String> names3 = employeeDirectory.InfoId(isd);
        System.out.println(names3);
    }
}