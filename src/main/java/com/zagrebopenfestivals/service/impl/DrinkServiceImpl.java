package com.zagrebopenfestivals.service.impl;

import com.zagrebopenfestivals.dto.request.DrinkRequest;
import com.zagrebopenfestivals.dto.response.DrinkResponse;
import com.zagrebopenfestivals.repository.DrinkRepository;
import com.zagrebopenfestivals.repository.FestivalRepository;
import com.zagrebopenfestivals.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO (studentski zadatak): implementirati CRUD logiku za Drink,
 * po uzoru na {@link FoodServiceImpl} (koji je potpuno gotov primjer).
 *
 * Repozitoriji (DrinkRepository, FestivalRepository) i DTO-i (DrinkRequest, DrinkResponse)
 * su već pripremljeni - potrebno je samo popuniti metode ispod.
 *
 * Koraci:
 *  1. getAllByFestival(festivalId) - vratiti listu pića za dani festival
 *  2. create(festivalId, request) - kreirati novo piće vezano uz festival
 *  3. update(id, request) - urediti postojeće piće
 *  4. delete(id) - obrisati piće
 *  5. Ne zaboraviti @Transactional / @Transactional(readOnly = true) na metodama
 *  6. Napraviti DrinkMapper (entitet -> DrinkResponse), analogno FoodMapper-u
 */
@Service
@RequiredArgsConstructor
public class DrinkServiceImpl implements DrinkService {

    private final DrinkRepository drinkRepository;
    private final FestivalRepository festivalRepository;

    @Override
    public List<DrinkResponse> getAllByFestival(Long festivalId) {
        throw new UnsupportedOperationException("TODO: implementirati DrinkService#getAllByFestival");
    }

    @Override
    public DrinkResponse create(Long festivalId, DrinkRequest request) {
        throw new UnsupportedOperationException("TODO: implementirati DrinkService#create");
    }

    @Override
    public DrinkResponse update(Long id, DrinkRequest request) {
        throw new UnsupportedOperationException("TODO: implementirati DrinkService#update");
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("TODO: implementirati DrinkService#delete");
    }
}