package com.pashatitov.spring.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/employee")
@Validated
public class myController {
    @RequestMapping("/")
public String showFirstView(){
    return "first-view";
}

@RequestMapping("/askdetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
}

@RequestMapping("/showdetails")
public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult){
if (bindingResult.hasErrors()){
    System.out.println("ДА БЛЯТЬ,ОШИБКА ЖЕ");
    return "first-view";
}
else
    return "show-emp-details-view";
}
}




