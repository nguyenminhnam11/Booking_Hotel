package com.example.beebookinghotel.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;

    private String username;

    private String fullname;

    private String phone;

    private String email;

    private String password;

    private boolean isDelete;

    private boolean active;

    private String confirmPassword;

    private String role;

}
