package com.example.admin_user_views.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UnitRequest {

    @NotBlank(message = "Unit Name is required")
    private String unitName;

    @NotBlank(message = "Unit Code is required")
    private String unitCode;
}
