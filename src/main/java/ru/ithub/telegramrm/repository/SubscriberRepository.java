package ru.ithub.telegramrm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ithub.telegramrm.model.entity.Subscriber;

import java.util.Optional;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

    Optional<Subscriber> findByMsisdn(String msisdn);
}
