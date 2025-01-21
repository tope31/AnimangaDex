package com.javakun.animangadex.controller;

import com.javakun.animangadex.dto.AnimeDto;
import com.javakun.animangadex.service.AnimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anime")
public class JikanController {

    private final AnimeService animeService;

    public JikanController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public AnimeDto getAnimeById(@PathVariable Long id) {
        return animeService.getAnimeById(id);
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }


}
