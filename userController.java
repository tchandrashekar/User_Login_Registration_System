
package com.example.User_Login_System.Controller;

import com.example.User_Login_System.Dto.UserDto;
import com.example.User_Login_System.Service.userservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class userController {
    
    @Autowired private userservice service;
    
    @GetMapping("/register")
    public String registerform(Model model){
        model.addAttribute("user",new UserDto());
        return "register";
    }
    
     @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") @Valid UserDto dto, BindingResult result) {
        if (result.hasErrors()) return "register";
        service.register(dto);
        return "redirect:/login";
    }
    
     @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    
     @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Create dashboard.html
    }
    
}
