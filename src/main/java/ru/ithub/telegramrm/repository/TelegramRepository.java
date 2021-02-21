package ru.ithub.telegramrm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.ithub.telegramrm.model.entity.Telegram;

@Repository
public interface TelegramRepository extends PagingAndSortingRepository<Telegram, Long> {
}
