package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping(value = "/test")
    public UserDto test() {
        UserDto userDto = new UserDto();
        userDto.setAge(28);
        userDto.setSize(270);
        userDto.setSize2(245);
        userDto.setName("bin");

        return userDto;
    }
}
