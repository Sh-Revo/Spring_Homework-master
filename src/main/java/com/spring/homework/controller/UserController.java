package com.spring.homework.controller;

import com.spring.homework.domain.User;
import com.spring.homework.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping(value = {"/show_user"})
    public String showUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "show_user";
    }

    @RequestMapping("/add_user")
    public String newUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "add_user";
    }

    @RequestMapping("/edit_user")
    public String editUserForm(@RequestParam long id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "edit_user";
    }

    @RequestMapping("/delete_user")
    public String deleteUserForm(@RequestParam long id) {
        userService.deleteUser(id);
        return "redirect:/api/user/show_user";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/api/user/show_user";
    }
}
