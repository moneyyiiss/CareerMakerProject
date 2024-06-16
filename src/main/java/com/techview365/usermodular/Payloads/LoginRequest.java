package com.techview365.usermodular.Payloads;

import lombok.Data;

@Data
public class LoginRequest {
    /**
     * The username provided by the user for login.
     */
    private String username;

    /**
     * The password provided by the user for login.
     */
    private String password;
}
