package com.example.admin_user_views.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {

    private HttpStatus errorCode;
    private boolean success;
    private String message;
    private T result;

    public static <T> ApiResponse<T> success(HttpStatus errorCode, T result) {
        return new ApiResponse<>(errorCode, true, "Success.",  result);
    }

    public static <T> ApiResponse<T> error(HttpStatus errorCode, String message) {
        return new ApiResponse<>(errorCode, false, message,  null);
    }
}
