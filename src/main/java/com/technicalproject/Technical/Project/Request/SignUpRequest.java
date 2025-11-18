package com.technicalproject.Technical.Project.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignUpRequest {
    private String firstName;
    private String lastName;
    @NotBlank(message = "Provide Username please")
    private String userName;
    @NotBlank(message = "Provider password please")
    private String password;
}
