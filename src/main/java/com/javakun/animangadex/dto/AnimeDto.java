package com.javakun.animangadex.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnimeDto {
    @JsonProperty("mal_id")
    private Long malId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("type")
    private String type;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("episodes")
    private Integer episodes;
}
