package com.example.EMS.controller;

import com.example.EMS.model.Employee;
import com.example.EMS.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", employeeService.getAllEmployee());
        return "index";
    }

    @GetMapping("/add")
    public String addNewEmp(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "addEmployee";
    }

    @PostMapping("/save")
    public String saveEmp(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/";
    }

    @GetMapping("/updateform/{id}")
    public String updateEmp(@PathVariable("id") long id, Model model) {
        Employee employee = employeeService.getById(id);
        model.addAttribute("employee", employee);
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmpById(@PathVariable("id") long id) {
        employeeService.deleteById(id);
        return "redirect:/";
    }
}
