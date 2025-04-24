package org.example.hotel_booking.controller;

import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.hotel_booking.dto.request.user.UserCreationRequest;
import org.example.hotel_booking.dto.response.ApiResponse;
import org.example.hotel_booking.dto.response.user.UserResponse;
import org.example.hotel_booking.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

public class UserController {

    UserService userService;

    //create user
    @PostMapping
    ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreationRequest request){
        System.out.println("controller createUser" + request);
        return ApiResponse.<UserResponse>builder()
                .data(userService.createUser(request))
                .build();
    }
}
