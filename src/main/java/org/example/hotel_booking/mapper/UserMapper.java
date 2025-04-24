package org.example.hotel_booking.mapper;


import org.example.hotel_booking.dto.request.user.UserCreationRequest;
import org.example.hotel_booking.dto.response.user.UserResponse;
import org.example.hotel_booking.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper  {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
//    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
