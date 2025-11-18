package com.technicalproject.Technical.Project.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateUserRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}
