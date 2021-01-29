package com.dd.solution.auth2.service.impl;

import com.dd.solution.auth2.dto.UserDTO;
import com.dd.solution.auth2.exception.UserNotFoundException;
import com.dd.solution.auth2.mapper.UserMapper;
import com.dd.solution.auth2.model.User;
import com.dd.solution.auth2.repository.UserRepository;
import com.dd.solution.auth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceIml(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDTO addUser(UserDTO userDTO) {
        final User user = UserMapper.convertToEntity(userDTO);
        return UserMapper.convertToDto(userRepository.save(user));
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        final User userUpdated = userRepository.findById(userDTO.getId())
                .map(user -> UserMapper.convertToEntity(userDTO))
                .map(userRepository::saveAndFlush)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });
        return UserMapper.convertToDto(userUpdated);
    }

    @Override
    public UserDTO getUserById(int id) {
        return null;
    }

    @Override
    public List<UserDTO> searchUserByName(String name) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUser() {
        return null;
    }
}
