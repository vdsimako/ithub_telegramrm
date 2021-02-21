package ru.ithub.telegramrm.iface;

import ru.ithub.telegramrm.model.dto.SubscriberDto;

public interface ISubscripberService {
    SubscriberDto getSubscriber(String msisdn);
}
