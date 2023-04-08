package ru.sbercourse.cinema.ticketoffice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Schema(description = "DTO фильма с сеансами")
public class FilmWithSessionsDTO extends FilmDTO {

    @Schema(description = "Сеансы фильма")
    private Set<FilmSessionDTO> filmSessions;
}