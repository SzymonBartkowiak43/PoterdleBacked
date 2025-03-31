package com.example.harypotedle.dto;

import com.example.harypotedle.Check;

import java.util.List;
import java.util.Map;

public record CharacterResponseDto(List<Map<String, Check>> howManyCorrect, Boolean isCorrect) {
}
