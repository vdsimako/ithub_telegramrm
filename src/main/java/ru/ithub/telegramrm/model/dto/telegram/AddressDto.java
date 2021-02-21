package ru.ithub.telegramrm.model.dto.telegram;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс описывающий адресс получателя
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {
    /**
     * тип адресса
     */
    private AddressType addressType;
    /**
     * Страна
     */
    private String country;
    /**
     * Регион
     */
    private String region;
    /**
     * Населенный пункт
     */
    private String locality;
    /**
     * Улица
     */
    private String street;
    /**
     * Дом
     */
    private String buildingNo;
    /**
     * Корпус
     */
    private String houseBuildingNo;
    /**
     * Строение
     */
    private String buildingStructureNo;
    /**
     * Тип помещения
     */
    private RoomType roomType;
    /**
     * Номер помещения
     */
    private String roomNo;
    /**
     * Дополнения к адресу
     */
    private String additionalInfo;
    /**
     * Получатель телеграммы
     */
    private String recipient;
}
