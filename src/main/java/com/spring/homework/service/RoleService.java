package com.spring.homework.service;

import com.spring.homework.domain.Role;
import com.spring.homework.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public void updateRole(Role role){
        roleRepository.save(role);
    }

    public void deleteRole(Role role){
        roleRepository.delete(role);
    }
}
