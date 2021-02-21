package ru.ithub.telegramrm.iface;

import ru.ithub.telegramrm.model.dto.UserDto;

public interface IUserService {
    UserDto getUser(Long userId);
}
