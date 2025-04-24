package org.example.hotel_booking.dto.request.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @Size(min = 3, max = 50, message = "USERNAME_INVALID")
    @NotBlank(message = "NOT_BLANK")
    String fullName;
    @Size(min = 5, max = 50, message = "INVALID_PASSWORD")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$", message = "PASSWORD_INVALID")
    @NotBlank(message = "NOT_BLANK")
    String password;
}
