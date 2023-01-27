package com.company.delivery.controllers;

import com.company.delivery.models.UserModel;
import com.company.delivery.dto.UserDto;
import com.company.delivery.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public String add(@RequestBody UserModel userModel){
        this.userService.save(userModel);
        return "New user is added";
    }

    @GetMapping("/getAll")
    public List<UserModel> list(){
        return userService.getAllUsers();
    }

    @PostMapping()
    public ResponseEntity<Object> saveUser(@RequestBody @Valid UserDto userDto) {
        var userModel = new UserModel();

        BeanUtils.copyProperties(userDto, userModel);
        userModel.setCreateAt(LocalDateTime.now(ZoneId.of("UTC")));

        return ResponseEntity.status(HttpStatus.CREATED).body(this.userService.save(userModel));
    }
}