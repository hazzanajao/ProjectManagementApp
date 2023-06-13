package com.projectmanagementappwithjwtspringsecurity.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginCredentials {
    private String email;
    private String password;
}
