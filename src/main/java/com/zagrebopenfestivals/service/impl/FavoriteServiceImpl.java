package com.zagrebopenfestivals.service.impl;

import com.zagrebopenfestivals.dto.response.FestivalSummaryResponse;
import com.zagrebopenfestivals.mapper.FestivalMapper;
import com.zagrebopenfestivals.repository.FavoriteRepository;
import com.zagrebopenfestivals.repository.FestivalRepository;
import com.zagrebopenfestivals.repository.UserRepository;
import com.zagrebopenfestivals.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO (studentski zadatak): implementirati logiku za omiljene festivale.
 *
 * Entitet {@code Favorite} i {@code FavoriteRepository} su već gotovi (N:M veza
 * User <-> Festival preko zasebne "join" tablice).
 *
 * Koraci:
 *  1. getMyFavorites(username) - dohvatiti sve Favorite zapise za korisnika i
 *     mapirati ih u listu FestivalSummaryResponse (koristeći FestivalMapper)
 *  2. addFavorite(username, festivalId) - provjeriti da festival postoji i da
 *     kombinacija (user, festival) već ne postoji (FavoriteRepository.existsByUserIdAndFestivalId),
 *     zatim kreirati i spremiti novi Favorite
 *  3. removeFavorite(username, festivalId) - pronaći Favorite
 *     (FavoriteRepository.findByUserIdAndFestivalId) i obrisati ga
 *  4. Dodati odgovarajuće @Transactional / @Transactional(readOnly = true) anotacije
 *  5. Baciti ResourceNotFoundException ako festival ili favorit ne postoji
 */
@Service
@RequiredArgsConstructor
public class FavoriteServiceImpl implements FavoriteService {

    private final FavoriteRepository favoriteRepository;
    private final FestivalRepository festivalRepository;
    private final UserRepository userRepository;
    private final FestivalMapper festivalMapper;

    @Override
    public List<FestivalSummaryResponse> getMyFavorites(String username) {
        throw new UnsupportedOperationException("TODO: implementirati FavoriteService#getMyFavorites");
    }

    @Override
    public void addFavorite(String username, Long festivalId) {
        throw new UnsupportedOperationException("TODO: implementirati FavoriteService#addFavorite");
    }

    @Override
    public void removeFavorite(String username, Long festivalId) {
        throw new UnsupportedOperationException("TODO: implementirati FavoriteService#removeFavorite");
    }
}