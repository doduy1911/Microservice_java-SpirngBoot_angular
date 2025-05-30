package com.bytehome.User.User.Controler.Admin;

import com.bytehome.User.User.DTO.userShowDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bytehome.User.User.Service.UserService;

import java.util.List;

@RestController
public class userApiController {
    private final UserService userService;
    public  userApiController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("api/test")
    public ResponseEntity<List<userShowDto>> findAll() {
        List<userShowDto> show = userService.findAll();

        return ResponseEntity.ok(show);
    }

}
