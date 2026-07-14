package com.zagrebopenfestivals.controller;

import com.zagrebopenfestivals.service.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO (studentski zadatak): implementirati REST endpointe za omiljene festivale:
 *
 *   GET    /favorites/me              -> lista mojih omiljenih festivala (USER)
 *   POST   /favorites/{festivalId}    -> dodaj festival u omiljene (USER)
 *   DELETE /favorites/{festivalId}    -> makni festival iz omiljenih (USER)
 *
 * Korisničko ime prijavljenog korisnika dobivate iz Spring Security konteksta,
 * npr. kroz parametar metode: {@code Authentication authentication} pa
 * {@code authentication.getName()}.
 *
 * Ne zaboravite:
 *  - implementirati odgovarajuće metode u FavoriteService (vidi TODO tamo)
 *  - dodati pravilo u SecurityConfig da su /favorites/** dostupni samo prijavljenom USER-u
 *  - vratiti ispravne HTTP statuse (201 za dodavanje, 204 za brisanje)
 */
@RestController
@RequiredArgsConstructor
public class FavoriteController {

    private final FavoriteService favoriteService;

    // TODO: implementirati endpointe
}
