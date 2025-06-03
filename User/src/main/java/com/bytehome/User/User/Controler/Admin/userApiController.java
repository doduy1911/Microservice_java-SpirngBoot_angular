package com.bytehome.User.User.Controler.Admin;

import com.bytehome.User.User.DTO.userAddDTO;
import com.bytehome.User.User.DTO.userShowDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("api/add")
    public ResponseEntity<String> addUser(@RequestBody userAddDTO dto ){
        try{
            userService.addUser(dto);
            return ResponseEntity.ok("Thêm Thành Công ");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
