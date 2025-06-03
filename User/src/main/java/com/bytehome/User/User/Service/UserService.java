package com.bytehome.User.User.Service;

import java.util.List;

import com.bytehome.User.User.DTO.userAddDTO;
import com.bytehome.User.User.DTO.userShowDto;
import com.bytehome.User.User.Entity.User;

public interface UserService {
    List<userShowDto> findAll();
    User addUser(userAddDTO userAddDTO);
}
