package com.zagrebopenfestivals.controller;

import com.zagrebopenfestivals.dto.response.DrinkResponse;
import com.zagrebopenfestivals.service.DrinkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zagrebopenfestivals.dto.request.DrinkRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DrinkController {

    private final DrinkService drinkService;

    @GetMapping("/festivals/{festivalId}/drinks")
    public List<DrinkResponse> getAllByFestival(@PathVariable Long festivalId) {
        return drinkService.getAllByFestival(festivalId);
    }

    @PostMapping("/festivals/{festivalId}/drinks")
    @ResponseStatus(HttpStatus.CREATED)
    public DrinkResponse create(
            @PathVariable Long festivalId,
            @Valid @RequestBody DrinkRequest request) {
        return drinkService.create(festivalId, request);
    }

    @PutMapping("/drinks/{id}")
    public DrinkResponse update(
            @PathVariable Long id,
            @Valid @RequestBody DrinkRequest request) {
        return drinkService.update(id, request);
    }

    @DeleteMapping("/drinks/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        drinkService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
