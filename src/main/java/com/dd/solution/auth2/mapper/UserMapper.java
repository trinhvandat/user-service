package com.dd.solution.auth2.mapper;

import com.dd.solution.auth2.dto.UserDTO;
import com.dd.solution.auth2.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapper {

    @Autowired
    private static ModelMapper modelMapper;

    public static UserDTO convertToDto(User user){
        return modelMapper.map(user, UserDTO.class);
    }

    public static User convertToEntity(UserDTO userDTO){
        return modelMapper.map(userDTO, User.class);
    }

}
