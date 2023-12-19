package com.glzd.expenseTrackerApp.data;


import com.glzd.expenseTrackerApp.business.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByEmailAddress(String userEmail);
}