package ru.ithub.telegramrm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ithub.telegramrm.iface.IUserService;
import ru.ithub.telegramrm.model.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public UserDto getUser() {
        Long userId = 1L;

        UserDto userDto = userService.getUser(userId);

        return userDto;
    }
}
