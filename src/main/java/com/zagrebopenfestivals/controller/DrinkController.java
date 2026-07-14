package com.zagrebopenfestivals.controller;

import com.zagrebopenfestivals.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO (studentski zadatak): implementirati REST endpointe za Drink,
 * potpuno analogno {@link FoodController} (koji je gotov primjer):
 *
 *   GET    /festivals/{festivalId}/drinks   -> lista pića za festival
 *   POST   /festivals/{festivalId}/drinks   -> kreiranje novog pića (ADMIN)
 *   PUT    /drinks/{id}                     -> uređivanje pića (ADMIN)
 *   DELETE /drinks/{id}                     -> brisanje pića (ADMIN)
 *
 * Ne zaboravite:
 *  - implementirati odgovarajuće metode u DrinkService (vidi TODO tamo)
 *  - dodati @Valid na request body
 *  - vratiti ispravne HTTP statuse (201 za create, 204 za delete)
 *  - dodati pravila pristupa u SecurityConfig (GET javno, write samo ADMIN)
 */
@RestController
@RequiredArgsConstructor
public class DrinkController {

    private final DrinkService drinkService;

    // TODO: implementirati endpointe (vidi FoodController kao primjer)
}
