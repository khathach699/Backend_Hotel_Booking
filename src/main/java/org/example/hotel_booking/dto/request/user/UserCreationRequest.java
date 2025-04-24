package org.example.hotel_booking.dto.request.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, max = 50, message = "USERNAME_INVALID")
    @NotBlank(message = "NOT_BLANK")
    String fullName;
    @Email(message = "VALIDATION_EMAIL")
    String email;
    @Size(min = 5, max = 50, message = "INVALID_PASSWORD")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$", message = "PASSWORD_INVALID")
    @NotBlank(message = "NOT_BLANK")
    String password;
}
