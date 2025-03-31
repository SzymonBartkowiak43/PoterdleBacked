package com.example.harypotedle;

import com.example.harypotedle.dto.CharacterDto;
import com.example.harypotedle.dto.CharacterResponseDto;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GameService {
    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;
    private Character dailyCharacter;

    public GameService(CharacterRepository characterRepository, CharacterMapper characterMapper) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;

    }

    public CharacterDto initializeCharacter() {
        List<Character> allCharacters = characterRepository.findAll();
        dailyCharacter = allCharacters.get((int) (Math.random() * allCharacters.size()));
        return characterMapper.toDto(dailyCharacter);
    }

    @Scheduled(cron = "0 0 23 * * ?")
    public CharacterDto initializeDailyCharacter() {
        List<Character> allCharacters = characterRepository.findAll();
        dailyCharacter = allCharacters.get((int) (Math.random() * allCharacters.size()));
        return characterMapper.toDto(dailyCharacter);
    }

    public CharacterResponseDto checkGuess(String guess) {

        Character guessedCharacter = characterRepository.findByNameIgnoreCase(guess).get();

        List<Map<String, Check>> attributesCheck = new ArrayList<>();

        attributesCheck.add(checkAttribute("gender", guessedCharacter.getGender(), dailyCharacter.getGender()));
        attributesCheck.add(checkAttribute("house", guessedCharacter.getHouse(), dailyCharacter.getHouse()));
        attributesCheck.add(checkAttribute("bloodStatus", guessedCharacter.getBloodStatus(), dailyCharacter.getBloodStatus()));
        attributesCheck.add(checkOccupation( guessedCharacter.getOccupation(), dailyCharacter.getOccupation()));
        attributesCheck.add(checkBirthYear( guessedCharacter.getBirthYear(), dailyCharacter.getBirthYear()));

        boolean isCorrect = guess.equals(dailyCharacter.getName());

        return new CharacterResponseDto(attributesCheck, isCorrect);
    }

    private Map<String, Check> checkAttribute(String attributeName, String guessedValue, String correctValue) {
        Check status = guessedValue.equalsIgnoreCase(correctValue) ? Check.CORRECT : Check.INCORRECT;

        return Map.of(attributeName, status);
    }

    private Map<String, Check> checkOccupation(String guessedValue, String correctValue) {
        if (guessedValue.equalsIgnoreCase(correctValue)) {
            return Map.of("occupation", Check.CORRECT);
        }

        String[] guessedParts = Arrays.stream(guessedValue.split(","))
                .map(String::trim)
                .toArray(String[]::new);

        String[] correctParts = Arrays.stream(correctValue.split(","))
                .map(String::trim)
                .toArray(String[]::new);

        boolean anyGuessedInCorrect = Arrays.stream(guessedParts)
                .anyMatch(part -> Arrays.asList(correctParts).contains(part));

        boolean anyCorrectInGuessed = Arrays.stream(correctParts)
                .anyMatch(part -> Arrays.asList(guessedParts).contains(part));

        if (anyGuessedInCorrect || anyCorrectInGuessed) {
            return Map.of("occupation", Check.PARTIALLY_CORRECT);
        }

        return Map.of("occupation", Check.INCORRECT);
    }

    private Map<String, Check> checkBirthYear(Integer guessedValue, Integer correctValue) {
        if(guessedValue.equals(correctValue)){
            return Map.of("birthYear", Check.CORRECT);
        }
        if(guessedValue > correctValue){
            return Map.of("birthYear", Check.IS_OLDER);
        }
        return Map.of("birthYear", Check.IS_YOUNGER);
    }

    public List<CharacterDto> getAllCharacters() {
        return characterRepository.findAll().stream()
                .map(characterMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<String> getAllCharactersName() {
        return characterRepository.findAll().stream()
                .map(Character::getName)
                .collect(Collectors.toList());
    }

    public CharacterDto getDailyCharacter() {
        return characterMapper.toDto(dailyCharacter);
    }
}