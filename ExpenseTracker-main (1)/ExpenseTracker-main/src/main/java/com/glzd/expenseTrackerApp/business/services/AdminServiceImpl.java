package com.glzd.expenseTrackerApp.business.services;


import com.glzd.expenseTrackerApp.business.model.Admin;
import com.glzd.expenseTrackerApp.business.model.AdminDto;
import com.glzd.expenseTrackerApp.data.AdminRepository;
import com.glzd.expenseTrackerApp.data.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    private final RoleRepository roleRepository;


    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setUsername(adminDto.getUsername());
        admin.setEmailAddress(adminDto.getEmailAddress());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }

    @Override
    public Admin findByUsername(String userEmail) {
        return adminRepository.findByEmailAddress(userEmail);
    }
}
