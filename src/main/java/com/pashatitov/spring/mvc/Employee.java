package com.pashatitov.spring.mvc;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.HashMap;
import java.util.Map;
@Validated
@Component
public class Employee {

    @NotBlank(message = "VISVETIS BLYAT")
    private String name;

    @NotBlank(message = "Surname - is required field")
    private String surname;
    @NotNull(message = "NPE")
    private int salary;

    private String department;
    private Map<String,String> departments;
    private String carBrand;
   private String [] language;
    private Map <String,String>languages;

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    private Map<String,String> carBrands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public Employee() {
    departments = new HashMap<String, String>();
    departments.put("IT", "Information Technology");
    departments.put("HR", "Human Resources");
    departments.put("Sales", "Sales");
carBrands = new HashMap<String, String>();
carBrands.put("BMW", "BMW");
carBrands.put("Audi", "Audi");
carBrands.put("Mazda", "Mazda");
languages = new HashMap<String, String>();
languages.put("ENG","English");
languages.put("RUS", "Russian");
languages.put("SP", "Spanish");

    }
}
