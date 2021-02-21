package ru.ithub.telegramrm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ithub.telegramrm.model.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
