package com.bytehome.User.User.Service;

import java.util.List;
import com.bytehome.User.User.DTO.userShowDto;

public interface UserService {
    List<userShowDto> findAll();
}
