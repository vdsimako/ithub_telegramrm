package ru.ithub.telegramrm.service;

import org.springframework.stereotype.Service;
import ru.ithub.telegramrm.iface.IUserService;
import ru.ithub.telegramrm.model.dto.UserDto;
import ru.ithub.telegramrm.model.entity.User;
import ru.ithub.telegramrm.model.exception.ExceptionMessage;
import ru.ithub.telegramrm.model.exception.TelegramRMException;
import ru.ithub.telegramrm.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto getUser(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);

        if (!userOptional.isPresent()) {
            throw new TelegramRMException(ExceptionMessage.USER_NOT_FOUND);
        }
        User user = userOptional.get();

        UserDto userDto = UserDto.builder()
                .userName(user.getUserName())
                .build();

        return userDto;
    }
}
