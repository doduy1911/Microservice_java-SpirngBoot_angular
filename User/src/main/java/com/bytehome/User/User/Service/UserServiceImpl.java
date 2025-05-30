package com.bytehome.User.User.Service;

import com.bytehome.User.User.DAO.UserRepository;
import com.bytehome.User.User.DTO.userShowDto;
import com.bytehome.User.User.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<userShowDto> findAll() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(user -> new userShowDto(
                        user.getUserId(),
                        user.getUsername(),
                        user.getPassword(),
                        user.getEmail()
                ))
                .collect(Collectors.toList());
    }


}
