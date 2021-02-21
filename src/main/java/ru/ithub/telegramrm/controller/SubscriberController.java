package ru.ithub.telegramrm.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ithub.telegramrm.model.dto.SubscriberDto;
import ru.ithub.telegramrm.iface.ISubscripberService;

@RestController
@RequestMapping(path = {"/subscriber"})
@Log4j2
public class SubscriberController {

    private final ISubscripberService subscriberService;

    public SubscriberController(ISubscripberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @GetMapping
    public SubscriberDto getSubscriber(@RequestParam(name = "msisdn") String msisdn) {
        log.info("Get subscriber info: msisdn={}", msisdn);

        SubscriberDto subscriberDto = subscriberService.getSubscriber(msisdn);

        log.info("Return subscriber info response: subscriber={}", subscriberDto);

        return subscriberDto;
    }
}
