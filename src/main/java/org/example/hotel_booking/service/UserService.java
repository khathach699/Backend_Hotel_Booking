package org.example.hotel_booking.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.hotel_booking.dto.request.user.UserCreationRequest;
import org.example.hotel_booking.dto.response.user.UserResponse;
import org.example.hotel_booking.entity.User;
import org.example.hotel_booking.exception.AppException;
import org.example.hotel_booking.exception.ErrorCode;
import org.example.hotel_booking.mapper.UserMapper;
import org.example.hotel_booking.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {


    UserRepository userRepository;
    UserMapper userMapper;

    // create user
    public UserResponse createUser(UserCreationRequest request){
        if(userRepository.existsByEmail(request.getEmail()))
            throw  new AppException(ErrorCode.USER_EXISTED);
        User user = userMapper.toUser(request);

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        System.out.println("passwordEncoder: " + request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        return userMapper.toUserResponse(userRepository.save(user));
    }

    // update user


}
