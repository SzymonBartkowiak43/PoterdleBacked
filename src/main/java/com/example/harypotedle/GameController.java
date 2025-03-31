package com.example.harypotedle;

import com.example.harypotedle.dto.CharacterDto;
import com.example.harypotedle.dto.CharacterResponseDto;
import com.example.harypotedle.request.GuessRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }


    @GetMapping("/characters")
    public ResponseEntity<List<CharacterDto>> getAllCharacters() {
        return ResponseEntity.ok(gameService.getAllCharacters());
    }

    @PostMapping("/guess")
    public ResponseEntity<CharacterResponseDto> makeGuess(@RequestBody GuessRequest guess) {
        return ResponseEntity.ok(gameService.checkGuess(guess.getGuess()));
    }

    @GetMapping("/initialize")
    public ResponseEntity<CharacterDto> initializeCharacter() {
        System.out.println("initializeDailyCharacter");
        return ResponseEntity.ok(gameService.initializeCharacter());
    }

    @GetMapping("/getDailyCharacter")
    public ResponseEntity<CharacterDto> getDailyCharacter() {
        return ResponseEntity.ok(gameService.getDailyCharacter());
    }

    @GetMapping("/allCharactersName")
    public ResponseEntity<List<String>> getAllCharactersName() {
        return ResponseEntity.ok(gameService.getAllCharactersName());
    }

}

