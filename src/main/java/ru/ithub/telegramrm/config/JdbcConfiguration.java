package ru.ithub.telegramrm.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.postgresql.util.PGobject;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import ru.ithub.telegramrm.model.dto.TelegramDto;
import ru.ithub.telegramrm.model.dto.telegram.AddressDto;
import ru.ithub.telegramrm.model.dto.telegram.SenderDto;
import ru.ithub.telegramrm.model.dto.telegram.TelegramBodyDto;

import java.sql.SQLException;
import java.util.Arrays;

@Configuration
public class JdbcConfiguration extends AbstractJdbcConfiguration {

    @Override
    public JdbcCustomConversions jdbcCustomConversions() {

        return new JdbcCustomConversions(Arrays.asList(
                AddressDtoWritingConverter.INSTANCE,
                AddressDtoReadingConverter.INSTANCE,
                TelegramBodyDtoWritingConverter.INSTANCE,
                TelegramBodyDtoReadingConverter.INSTANCE,
                SenderDtoWritingConverter.INSTANCE,
                SenderDtoReadingConverter.INSTANCE
        ));

    }


    @WritingConverter
    enum AddressDtoWritingConverter implements Converter<AddressDto, PGobject> {
        INSTANCE;
        @Override
        public PGobject convert(AddressDto source) {
            ObjectMapper objectMapper = new ObjectMapper();

            PGobject jsonObject = new PGobject();
            jsonObject.setType("json");
            try {
                jsonObject.setValue(objectMapper.writeValueAsString(source));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return jsonObject;
        }
    }

    @ReadingConverter
    enum AddressDtoReadingConverter implements Converter<PGobject, AddressDto> {
        INSTANCE;
        @Override
        public AddressDto convert(PGobject source) {
            ObjectMapper objectMapper = new ObjectMapper();
            AddressDto addressDto = null;

            try {
                addressDto = objectMapper.readValue(source.getValue(), AddressDto.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return addressDto;
        }
    }

    @WritingConverter
    enum TelegramBodyDtoWritingConverter implements Converter<TelegramBodyDto, PGobject> {
        INSTANCE;
        @Override
        public PGobject convert(TelegramBodyDto source) {
            ObjectMapper objectMapper = new ObjectMapper();

            PGobject jsonObject = new PGobject();
            jsonObject.setType("json");
            try {
                jsonObject.setValue(objectMapper.writeValueAsString(source));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return jsonObject;
        }
    }

    @ReadingConverter
    enum TelegramBodyDtoReadingConverter implements Converter<PGobject, TelegramBodyDto> {
        INSTANCE;
        @Override
        public TelegramBodyDto convert(PGobject source) {
            ObjectMapper objectMapper = new ObjectMapper();
            TelegramBodyDto telegramBodyDto = null;

            try {
                telegramBodyDto = objectMapper.readValue(source.getValue(), TelegramBodyDto.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return telegramBodyDto;
        }
    }

    @WritingConverter
    enum SenderDtoWritingConverter implements Converter<SenderDto, PGobject> {
        INSTANCE;
        @Override
        public PGobject convert(SenderDto source) {
            ObjectMapper objectMapper = new ObjectMapper();

            PGobject jsonObject = new PGobject();
            jsonObject.setType("json");
            try {
                jsonObject.setValue(objectMapper.writeValueAsString(source));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return jsonObject;
        }
    }

    @ReadingConverter
    enum SenderDtoReadingConverter implements Converter<PGobject, SenderDto> {
        INSTANCE;
        @Override
        public SenderDto convert(PGobject source) {
            ObjectMapper objectMapper = new ObjectMapper();
            SenderDto senderDto = null;

            try {
                senderDto = objectMapper.readValue(source.getValue(), SenderDto.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return senderDto;
        }
    }


}
