package com.dd.solution.auth2.service;

import java.util.List;

import com.dd.solution.auth2.dto.UserDTO;
import com.dd.solution.auth2.model.User;

public interface UserService {

    UserDTO addUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userDTO);

    UserDTO getUserById(int id);

    List<UserDTO> searchUserByName(String name);

    List<UserDTO> getAllUser();
}
