package com.spring.homework.controller;

import com.spring.homework.domain.Role;
import com.spring.homework.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/getAll")
    public List<Role> getAllRole(){
        return roleService.getAllRoles();
    }

    @PostMapping("/updateAndInsert")
    public void updateRole(@RequestBody Role role){
        roleService.updateRole(role);
    }

    @PostMapping("/delete")
    public void deleteRole(@RequestBody Role role){
        roleService.deleteRole(role);
    }
}
