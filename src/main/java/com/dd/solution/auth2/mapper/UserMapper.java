package com.dd.solution.auth2.mapper;

import com.dd.solution.auth2.dto.UserDTO;
import com.dd.solution.auth2.model.User;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;

@Slf4j
public class UserMapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static UserDTO convertToDto(User user){
        return modelMapper.map(user, UserDTO.class);
    }

    public static User convertToEntity(UserDTO userDTO){
        User user = modelMapper.map(userDTO, User.class);
        return user;
    }

}
