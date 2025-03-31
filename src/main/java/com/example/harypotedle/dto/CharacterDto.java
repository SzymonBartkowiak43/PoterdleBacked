package com.example.harypotedle.dto;

import com.example.harypotedle.Character;

public record CharacterDto(
         String name,
         String gender,
         String house,
         String occupation,
         Integer birthYear,
         String bloodStatus
        ) {
}
