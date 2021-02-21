package ru.ithub.telegramrm.service;

import org.springframework.stereotype.Service;
import ru.ithub.telegramrm.iface.ISubscripberService;
import ru.ithub.telegramrm.model.dto.SubscriberDto;
import ru.ithub.telegramrm.model.entity.Subscriber;
import ru.ithub.telegramrm.model.exception.ExceptionMessage;
import ru.ithub.telegramrm.model.exception.TelegramRMException;
import ru.ithub.telegramrm.repository.SubscriberRepository;

import java.util.Optional;

@Service
public class SubscriberService implements ISubscripberService {
    private final SubscriberRepository subscriberRepository;

    public SubscriberService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    @Override
    public SubscriberDto getSubscriber(String msisdn) {

        Optional<Subscriber> subscriberOptional = subscriberRepository.findByMsisdn(msisdn);

        if (!subscriberOptional.isPresent()) {
            throw new TelegramRMException(ExceptionMessage.SUBSCRIBER_NOT_FOUND);
        }

        Subscriber subscriber = subscriberOptional.get();

        SubscriberDto subscriberDto = SubscriberDto.builder()
                .msisdn(subscriber.getMsisdn())
                .firstName(subscriber.getFirstName())
                .lastName(subscriber.getLastName())
                .patronymic(subscriber.getPatronymic())
                .isServiceAllowed(subscriber.getIsServiceAllowed())
                .build();

        return subscriberDto;
    }
}
