package com.glzd.expenseTrackerApp.business.services;


import com.glzd.expenseTrackerApp.business.model.Admin;
import com.glzd.expenseTrackerApp.business.model.AdminDto;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
