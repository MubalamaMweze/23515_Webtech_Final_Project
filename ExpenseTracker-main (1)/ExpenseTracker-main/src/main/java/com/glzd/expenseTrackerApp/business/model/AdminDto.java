package com.glzd.expenseTrackerApp.business.model;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {

    @Size(min = 3, max = 10, message = "Last name contains 3-10 characters")
    private String username;
    @Pattern(regexp = ".*@.*", message = "please an email should contain @ and a domain name")
    private String emailAddress;
    @Size(min = 8, max = 10, message = "Password contains 8-10 characters")
    private String password;
}
