package com.javakun.animangadex.service;

import com.javakun.animangadex.dto.AnimeDto;
import com.javakun.animangadex.dto.AnimeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AnimeServiceImpl implements AnimeService {

    private final WebClient webClient;

    public AnimeServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public AnimeDto getAnimeById(Long id) {

        WebClient.ResponseSpec responseSpec = webClient.get().uri("/anime/{id}", id).retrieve();

        String rawResponse = responseSpec.bodyToMono(String.class).block();
        System.out.println("Raw response from Jikan API: " + rawResponse);

//        return responseSpec.bodyToMono(AnimeResponse.class)
//                .map(AnimeResponse::getData)
//                .block();

        return responseSpec.bodyToMono(AnimeResponse.class)
                .map(AnimeResponse::getData)
                .block();

//        AnimeDto anime =  webClient.get()
//                .uri("/anime/{id}", id)
//                .retrieve()
//                .bodyToMono(AnimeDto.class)
//                .block();
//
//        System.out.println("Retrieved anime: " + anime);
//
//        return anime;
    }
}
