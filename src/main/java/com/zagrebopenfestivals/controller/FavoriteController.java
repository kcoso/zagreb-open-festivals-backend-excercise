package com.zagrebopenfestivals.controller;

import com.zagrebopenfestivals.dto.response.FestivalSummaryResponse;
import com.zagrebopenfestivals.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/favorites")
public class FavoriteController {

    private final FavoriteService favoriteService;

    @GetMapping("/me")
    public List<FestivalSummaryResponse> getMyFavorites(
            Authentication authentication
    ) {
        return favoriteService.getMyFavorites(authentication.getName());
    }

    @PostMapping("/{festivalId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addFavorite(
            @PathVariable Long festivalId,
            Authentication authentication
    ) {
        favoriteService.addFavorite(
                authentication.getName(),
                festivalId
        );
    }

    @DeleteMapping("/{festivalId}")
    public ResponseEntity<Void> removeFavorite(
            @PathVariable Long festivalId,
            Authentication authentication
    ) {
        favoriteService.removeFavorite(
                authentication.getName(),
                festivalId
        );

        return ResponseEntity.noContent().build();
    }
}
