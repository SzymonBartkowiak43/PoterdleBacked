package com.example.harypotedle;

import com.example.harypotedle.dto.CharacterDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CharacterMapper {

    public List<CharacterDto> toDto(List<Character> characters) {
        return characters.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public CharacterDto toDto(Character character) {
        return new CharacterDto(
                character.getName(),
                character.getGender(),
                character.getHouse(),
                character.getOccupation(),
                character.getBirthYear(),
                character.getBloodStatus()
        );
    }
}
